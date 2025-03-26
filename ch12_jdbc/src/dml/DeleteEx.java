package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteEx {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";

            con = DriverManager.getConnection(url, user, password);

            System.out.println("연결되었습니다.");

            String sql = "DELETE DEPT_TEMP WHERE DEPTNO = 40";

            pstmt = con.prepareStatement(sql);

            int result = pstmt.executeUpdate(); // 실행 성공한 개수만큼 result에 반환

            if (result > 0) {
                System.out.println("삭제 성공");

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                pstmt.close();
            } catch (Exception e) {

            }

        }

    }
}
