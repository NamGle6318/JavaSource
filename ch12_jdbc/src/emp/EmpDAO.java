package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
    // JDBC 과정을 메서드로 만든거
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public Connection getConnection() {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "tiger";
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {

        }
        return con;
    }

    static { // static 블럭 내 생성되는 것들은 전부 static 타입이 됨
        // 드라이브 로딩 = db 테이블 연결, 한 database를 공유하기 위해 static 선언
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Connection, Statement + ResultSet close
    public void close(Connection con, PreparedStatement pstmt) {
        try {
            con.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
        try {
            rs.close();
            con.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // select, insert, update, delete

    // EMP_TEMP 테이블의 empno 번호를 입력받아 해당 행을 삭제
    public int delete(int num) {
        getConnection();
        int result = 0;
        String sql = "DELETE FROM EMP_TEMP WHERE EMPNO = ? ";

        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, num);
            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    public int update(EmpDTO dto) {
        getConnection();
        int result = 0;
        String sql = "UPDATE emp_temp SET SAL = ? WHERE EMPNO = ? ";

        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, dto.getSal());
            pstmt.setInt(2, dto.getEmpno());
            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    public int insert(EmpDTO dto) {
        getConnection();
        int result = 0;
        String sql = "INSERT INTO EMP_TEMP (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES (?,?,?,?,?,?,?,?)";
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, dto.getEmpno());
            pstmt.setString(2, dto.getEname());
            pstmt.setString(3, dto.getJob());
            pstmt.setInt(4, dto.getMgr());

            pstmt.setString(5, dto.getHiredate());
            pstmt.setInt(6, dto.getSal());
            pstmt.setInt(7, dto.getComm());
            pstmt.setInt(8, dto.getDeptno());
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }
}
