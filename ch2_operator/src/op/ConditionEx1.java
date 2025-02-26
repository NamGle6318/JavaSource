package op;

// 삼항연산자 

//변수 x의 값이 음수일시 양수로 만들기
//변수 y의 값이 0보다 크면 'A' 출력, 아니면 'B'출력
//변수 z의 값이 0보다 크면 "A" 출력, 아니면 "B"출력

public class ConditionEx1 {
    public static void main(String[] args) {
        int x, y, z = 0;
        x = 10;
        y = -5;
        z = 0;
        
        int result1 = x >= 0 ? x : -x;
        System.out.println(result1);
        
        char ch = y >= 0 ? 'A' : 'B';
        System.out.println(ch);

        String str = z >= 0 ? "A" : "B";
        System.out.println(str);
        

    }
    
}

// ( 1번 ? 2번 : 3번 )
// 1번의 비교값이 true일 경우 2번 실행
// 1번의 비교값이 false일 경우 3번 실행

