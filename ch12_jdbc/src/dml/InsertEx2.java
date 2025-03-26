package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import dto.DeptDto;

public class InsertEx2 {
    // dept_temp table에 사용자가 입력한 데이터를 insert해주는 프로그램
    private static Scanner scanner = new Scanner(System.in);

    // 대입할 데이터 사용자에게 입력받기
    public static DeptDto data(Scanner scanner) {
        System.out.println("--------------dept 테이블 데이터 입력 ---------------");
        System.out.print("DEPNO 데이터 입력 (INT) :");
        int deptno = Integer.parseInt(scanner.nextLine());
        System.out.print("DNAME 데이터 입력 (String) : ");
        String dname = scanner.nextLine();
        System.out.print("LOC 데이터 입력 (String) : ");
        String loc = scanner.nextLine();
        System.out.printf("%d   %s   %s", deptno, dname, loc);

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

            // TODO : ? 데이터 대입
            DeptDto dto = data(scanner);

            if (con != null) {
                System.out.println("연결되었습니다.");

                // TODO : 테이블에 데이터 입력 안되는 이유 찾아보기
                String sql = " INSERT INTO dept_temp(deptno, dname, loc) VALUES(?,?,?)";
                pstmt = con.prepareStatement(sql); // 여기서 sql문 실행

                pstmt.setInt(1, dto.getDeptno());
                pstmt.setString(2, dto.getDname());
                pstmt.setString(3, dto.getLoc());

                result = pstmt.executeUpdate(); // 영향받은 개수를 int값으로 반환

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
