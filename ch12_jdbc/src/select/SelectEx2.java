package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectEx2 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null; // select문 결과 담는 객체

        try {
            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // 2. connection 객체 생성

            // jdbc:oracle:thin: => Oracle 연결문자열
            // @
            // localhost => 내 PC(== 127.0.0.1)
            // 1521 => Oracle 서버 포트번호
            // xe => Oracle DB명
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";

            con = DriverManager.getConnection(url, user, password);

            if (con != null) {
                System.out.println("연결되었습니다.");

                // empno = 7369인 사람 조회
                String sql = "SELECT e.* FROM EMP e WHERE e.EMPNO = 7369";

                // 3. statement 객체 생성
                pstmt = con.prepareStatement(sql);

                // 4. Query 수행
                rs = pstmt.executeQuery();

                // ResultSet 객체로부터 데이터 추출
                while (rs.next()) {
                    int empno = rs.getInt(1);
                    String ename = rs.getString("ename");
                    String job = rs.getString("job");
                    int mgr = rs.getInt("mgr");
                    String hireDate = rs.getString("hiredate");
                    int sal = rs.getInt("sal");
                    int comm = rs.getInt("comm");
                    int deptno = rs.getInt("deptno");

                    System.out.printf("%d  %s  %s  %d  %s  %d  %d  %d\n",
                            empno, ename, job, mgr, hireDate, sal, comm, deptno);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // 5.6.7. ResultSet, Statement, Connection close
                rs.close();
                con.close();
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
