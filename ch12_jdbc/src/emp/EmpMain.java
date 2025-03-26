package emp;

import java.util.Scanner;

public class EmpMain {
    // emp DB작업 공간

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        EmpDAO dao = new EmpDAO();
        EmpDTO dto = new EmpDTO();
        int result = 0;
        while (run) {
            System.out.println("======================");
            System.out.println("1. 입력");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 조회");
            System.out.println("5. 종료");
            System.out.println("======================");
            System.out.print("메뉴 >> ");
            int menu = Integer.parseInt(scanner.nextLine());

            switch (menu) {
                case 1: // INSERT
                    dto = insertInfo(scanner);
                    result = dao.insert(dto);
                    System.out.println(result > 0 ? "입력 성공" : "입력 실패");
                    break;
                case 2: // UPDATE (sal)
                    dto = updateInfo(scanner);
                    result = dao.update(dto);
                    System.out.println(result > 0 ? "수정 성공" : "수정 실패");
                    break;
                case 3: // DELETE (empno)
                    int empno = deleteInfo(scanner);
                    result = dao.delete(empno);
                    System.out.println(result > 0 ? "삭제 성공" : "삭제 실패");
                    break;
                case 4: // SELECT
                    break;
                case 5: // 종료
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }

    public static int deleteInfo(Scanner scanner) {
        // 삭제할 emp번호만 받아서 리턴
        System.out.print("삭제 대상 empno : ");
        int empNo = Integer.parseInt(scanner.nextLine());
        return empNo;
    }

    public static EmpDTO updateInfo(Scanner scanner) {
        // empno에 해당하는 인원의 sal을 수정
        System.out.print("수정할 empno : ");
        int empNo = Integer.parseInt(scanner.nextLine());
        System.out.print("수정할 sal : ");
        int sal = Integer.parseInt(scanner.nextLine());

        EmpDTO dto = EmpDTO.builder()
                .empno(empNo)
                .sal(sal).build();
        return dto;
    }

    public static EmpDTO insertInfo(Scanner scanner) {
        // 사원 정보를 입력받아 Emp_temp 테이블에 새로운 행 추가
        System.out.print("입력할 사번 : ");
        int empNo = Integer.parseInt(scanner.nextLine());
        System.out.print("입력할 이름 : ");
        String ename = scanner.nextLine();
        System.out.print("입력할 직무 : ");
        String job = scanner.nextLine();
        System.out.print("입력할 매니저번호 : ");
        int mgr = Integer.parseInt(scanner.nextLine());
        System.out.print("입력할 입사날짜 : ");
        String hiredate = scanner.nextLine();
        System.out.print("입력할 급여 : ");
        int sal = Integer.parseInt(scanner.nextLine());
        System.out.print("입력할 보너스 : ");
        int comm = Integer.parseInt(scanner.nextLine());
        System.out.print("입력할 부서번호 : ");
        int deptno = Integer.parseInt(scanner.nextLine());

        EmpDTO dto = EmpDTO.builder()
                .empno(empNo)
                .ename(ename)
                .job(job)
                .mgr(mgr)
                .hiredate(hiredate)
                .sal(sal)
                .comm(comm)
                .deptno(deptno)
                .build();
        return dto;
    }
}
