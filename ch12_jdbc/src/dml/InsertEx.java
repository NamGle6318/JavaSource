package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertEx {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null; // select문 결과 담는 객체
        int result = 0;

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";

            con = DriverManager.getConnection(url, user, password);
            if (con != null) {
                System.out.println("연결되었습니다.");
                String sql = " INSERT INTO dept_temp(DEPTNO, DNAME, LOC) VALUES(10, 'ACCOUNTING', 'NEW YORK')";
                pstmt = con.prepareStatement(sql);
                result = pstmt.executeUpdate(sql);

                if (result > 0) {
                    System.out.println("입력 성공");
                } else {
                    System.out.println("입력 실패");
                }

            }

        } catch (Exception e) {

            e.printStackTrace();
        } finally {
            try {
                con.close();
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
