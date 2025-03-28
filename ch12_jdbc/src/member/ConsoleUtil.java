package member;

import java.util.Scanner;

// 출력 관련 클래스
public class ConsoleUtil {
    public MemberDTO memberInsertInfo(Scanner scanner) {
        MemberDTO mDto = new MemberDTO();
        System.out.println();
        System.out.println("==========================회원정보 입력화면=============================");
        System.out.print(" 아이디 :");
        mDto.setId(scanner.nextLine());
        System.out.print(" 이름   :");
        mDto.setName(scanner.nextLine());
        System.out.print(" 주소   :");
        mDto.setAddr(scanner.nextLine());
        System.out.print(" 이메일 :");
        mDto.setEmail(scanner.nextLine());
        System.out.print(" 나이   :");
        mDto.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("==========================회원정보 입력완료=============================");
        System.out.println();

        return mDto;
    }

    public void printInsertSuccessMessage(int result) {
        System.out.println(result > 0 ? "입력성공" : "입력실패");
    }

    public void printUpdateSuccessMessage(int result, String id) {
        System.out.println(result > 0 ? id + " 님의 정보를 " + "입력성공했습니다." : "입력실패했습니다.");
    }

    public MemberDTO memberUpdateMenu(Scanner scanner) {
        MemberDTO mDto = new MemberDTO();
        System.out.println("==========================회원 정보 수정================================");
        System.out.println("1. 주소 수정");
        System.out.println("1. 이메일 수정");
        System.out.println("========================================================================");
        System.out.print("번호 입력 : ");
        int no = Integer.parseInt(scanner.nextLine());
        if (no == 1) {
            return mDto = memberUpdateAddr(scanner);
        } else if (no == 2) {
            return mDto = memberUpdateEmail(scanner);
        }
        return null;

    }

    public MemberDTO memberUpdateAddr(Scanner scanner) {
        MemberDTO mDto = new MemberDTO();
        System.out.println("==========================회원정보 수정 화면============================");
        System.out.print("변경대상 아이디 입력 : ");
        mDto.setId(scanner.nextLine());
        System.out.print("변경할 주소 입력 : ");
        mDto.setAddr(scanner.nextLine());
        System.out.println("==========================회원정보 수정 완료============================");
        return mDto; // mdto ID, addr 정보 입력
    }

    public MemberDTO memberUpdateEmail(Scanner scanner) {
        MemberDTO mDto = new MemberDTO();
        System.out.println("==========================회원정보 수정 화면============================");
        System.out.print("변경대상 아이디 입력 : ");
        mDto.setId(scanner.nextLine());
        System.out.print("변경할 이메일 입력 : ");
        mDto.setEmail(scanner.nextLine());
        System.out.println("==========================회원정보 수정 완료============================");

        return mDto;
    }

    public String memberDeleteInfo(Scanner scanner) {
        System.out.println("==========================회원정보 삭제 화면============================");
        System.out.print("삭제할 회원의 id :");
        String id = scanner.nextLine();
        System.out.println("==========================회원정보 삭제 완료============================");
        return id;
    }
}
