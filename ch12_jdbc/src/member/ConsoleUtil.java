package member;

import java.util.List;
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

    public void printDeleteSuccessMessage(int result, String id) {
        System.out.println(result > 0 ? id + " 님의 정보를 " + "삭제성공했습니다." : "삭제실패했습니다.");
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
        System.out.println("==========================회원정보 수정 중==============================");

        return mDto;
    }

    public String memberDeleteInfo(Scanner scanner) {
        System.out.println("==========================회원정보 삭제 화면============================");
        System.out.print("삭제할 회원의 id :");
        String id = scanner.nextLine();
        System.out.println("==========================회원정보 삭제 중==============================");
        return id;
    }

    // 조회
    public String memberSelectInfo(Scanner scanner) {
        String input = null;
        System.out.println("==========================회원정보 입력화면=============================");
        System.out.println("1. 아이디 조회");
        System.out.println("2. 이름 조회");
        System.out.println("==========================회원정보 입력화면=============================");
        System.out.print(" 번호 :");

        switch (Integer.parseInt(scanner.nextLine())) {
            case 1:
                System.out.println("조회 회원 아이디 : ");
                input = scanner.nextLine();
                break;
            case 2:
                System.out.println("조회 회원 이름 : ");
                input = scanner.nextLine();
                break;
            default:
                break;
        }
        return input;
    }

    // dto 출력
    public void printSelectTo(MemberDTO memberDTO) {
        System.out.println("==========================회원정보 조회 화면============================");
        System.out.println("번호 : " + memberDTO.getNo());
        System.out.println("아이디 : " + memberDTO.getId());
        System.out.println("이름 : " + memberDTO.getName());
        System.out.println("주소 : " + memberDTO.getAddr());
        System.out.println("이메일 : " + memberDTO.getEmail());
        System.out.println("나이 : " + memberDTO.getAge());
        System.out.println("========================================================================");
    }

    public void memberAllPrint(List<MemberDTO> list) {
        System.out.println("==========================회원정보 조회 화면============================");
        System.out.println("번호 \t 아이디 \t 이름 \t 주소 \t 이메일 \t 나이");
        for (MemberDTO memberDTO : list) {
            System.out.print(memberDTO.getNo() + "\t");
            System.out.print(memberDTO.getId() + "\t");
            System.out.print(memberDTO.getName() + "\t");
            System.out.print(memberDTO.getAddr() + "\t");
            System.out.print(memberDTO.getEmail() + "\t");
            System.out.println(memberDTO.getAge());
        }
        System.out.println("=========================================================================");
    }

}
