package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import dto.DeptDto;

public class UpdateEx1 {
    // dept_temp table에 사용자가 입력한 데이터를 insert해주는 프로그램
    private static Scanner scanner = new Scanner(System.in);

    // 대입할 데이터 사용자에게 입력받기
    public static DeptDto data(Scanner scanner) {
        System.out.println("--------------dept 테이블 데이터 입력 ---------------");
        System.out.print("DEPNO 데이터 입력 (INT) :");
        int deptno = Integer.parseInt(scanner.nextLine());
        System.out.print("DNAME 데이터 입력 (String) :");
        String dname = scanner.nextLine();
        System.out.print("LOC 데이터 입력 (String) :");
        String loc = scanner.nextLine();

        DeptDto dto = new DeptDto(deptno, dname, loc);

        return dto;
    }

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

                String sql = " UPDATE dept_temp SET loc = 'NEW YORK' WHERE deptno = 10";
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
        scanner.close();
    }
}
