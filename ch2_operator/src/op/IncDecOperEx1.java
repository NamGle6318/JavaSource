package op;

//증감연산자 : +1 = ++, -1 = --로 표현
// 10 + 1 = 10++ , 10 -1 = 10--
//증감연산자가 변수 앞(전위), 변수 뒤(후위)
//전위, 후위 연산자를 단독으로 쓸 시에는 결과에 차이가 없음

//다른 수식에 포함되거나 메서드의 매개변수?에 사용되는 경우
//=단독으로 사용되지 않는 경우 결과가 다를 수 있다

public class IncDecOperEx1 {
    public static void main(String[] args) {
        int num = 10;
        --num; 
        //num = num -1;
        //num--;
        
        int num2 = 20;
        //++num2
        //① num2_1을 먼저 한 후 사용
        //num2++
        //① num2를 사용
        //② num2값을 ++
        
    System.out.println("num = " + num);
    System.out.println("num2 = " + (++num2));
    System.out.println("num2 = " + (num2++)); 
    System.out.println("num2 = " + num2);

    
 }   
}
