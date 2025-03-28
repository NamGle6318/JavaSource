package member;

import java.util.List;
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
        String id = " ";
        List<MemberDTO> list = null;

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
                    mDto = util.memberInsertInfo(scanner);
                    result = mDao.insert(mDto);
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
                    id = util.memberDeleteInfo(scanner);
                    result = mDao.delete(id);
                    util.printDeleteSuccessMessage(result, id);
                    break;
                case 4: // SELECT TO
                    String input = util.memberSelectInfo(scanner);

                    // regex = 정규식 [a-z], [A-Z], [0-9], [^a-z]. [A-Za-z0-9]
                    // input.matches(regex); 정규식에 해당하면 true를 반환

                    // 아이디는 영어로 시작 => getRow
                    if (input.matches("^[A-Za-z].*")) {
                        mDto = mDao.getRow(input);
                        if (mDto != null) {
                            util.printSelectTo(mDto);
                        } else {
                            System.out.println("존재하지 않는 id입니다.");
                        }

                    } else { // 이름은 한글로 시작 => GetNameList()
                        list = mDao.getNameList(input);
                        if (!list.isEmpty()) {
                            util.memberAllPrint(list);
                            // util.printSelectTo(mDto);

                        } else {
                            System.out.println("존재하지 않는 id입니다.");
                        }
                    }
                    break;
                case 5: // SELECT ALL
                    list = mDao.getList();
                    util.memberAllPrint(list);
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
