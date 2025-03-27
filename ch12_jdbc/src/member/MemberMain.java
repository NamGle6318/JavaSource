package member;

import java.util.Scanner;

public class MemberMain {

    // 메뉴같은 창을 출력
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberDAO mDao = new MemberDAO();
        MemberDTO mDto = null;
        ConsoleUtil util = new ConsoleUtil();
        boolean run = true;
        int result = 0;

        while (run) {

            System.out.println("===============================MEMBER==================================");
            System.out.println("1. member 추가");
            System.out.println("2. member 수정");
            System.out.println("3. member 삭제");
            System.out.println("4. member 조회");
            System.out.println("5. member 전체조회");
            System.out.println("6. 프로그램 종료");
            System.out.println("========================================================================");
            System.out.print("실행하고 싶은 번호를 입력하시오 : ");

            int menu = (Integer.parseInt(scanner.nextLine()));

            switch (menu) {
                case 1: // INSERT
                    MemberDTO dto = util.memberInsertInfo(scanner);
                    result = mDao.insert(dto);
                    util.printInsertSuccessMessage(result);

                    break;
                case 2: // UPDATE
                    mDto = util.memberUpdateMenu(scanner);
                    if (mDto != null) {
                        result = mDao.update(mDto);
                        util.printUpdateSuccessMessage(result, mDto.getId());
                    }
                    // 출력문 호출
                    break;
                case 3: // DELETE
                    break;
                case 4: // SELECT TO
                    break;
                case 5: // SELECT ALL
                    break;
                case 6: // EXIT
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }
}
