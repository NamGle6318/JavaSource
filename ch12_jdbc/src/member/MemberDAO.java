package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import emp.EmpDTO;

public class MemberDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;
    private EmpDTO dto;

    static {

        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

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

    // DML + Select

    // INSERT
    public int insert(MemberDTO memberDTO) {
        String sql = "INSERT INTO MEMBER (ID, NAME, ADDR, EMAIL, AGE) VALUES (?,?,?,?,?)";
        int result = 0;
        getConnection();

        try {
            pstmt = con.prepareStatement(sql);

            pstmt.setString(1, memberDTO.getId());
            pstmt.setString(2, memberDTO.getName());
            pstmt.setString(3, memberDTO.getAddr());
            pstmt.setString(4, memberDTO.getEmail());
            pstmt.setInt(5, memberDTO.getAge());

            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    // id를
    public int update(MemberDTO memberDTO) {
        String sql = "UPDATE MEMBER ";
        // SET ADDR = ? WHERE ID = ?";
        int result = 0;

        getConnection();
        try {
            if (memberDTO.getAddr() != null) { // addr != null
                sql += "SET ADDR = ? ";
                sql += " WHERE ID = ?";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1, memberDTO.getAddr());
                pstmt.setString(2, memberDTO.getId());
            } else { // email != null
                sql += "SET EMAIL = ? ";
                sql += " WHERE ID = ?";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1, memberDTO.getEmail());
                pstmt.setString(2, memberDTO.getId());

            }

            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public int delete() {

        return 0;
    }

    // select : ~~DTO(where pk 지정) or List<~~~DTO
    public void select() {

        return;
    }
}
