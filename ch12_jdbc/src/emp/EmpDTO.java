package emp;

// INT    STR    STR  INT  Date      INT  INT   INT

// EMPNO  ENAME  JOB  MGR  HIREDATE  SAL  COMM  DEPTNO

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class EmpDTO {
    // dto : ? 데이터 입력 받기 (테이블의 한행과 같은 구조)
    // emp 테이블의 한 행
    private int empno;
    private String ename;
    private String job;
    private int mgr;
    private String hiredate;
    private int sal;
    private int comm;
    private int deptno;

}
