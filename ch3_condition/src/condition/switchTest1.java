package condition;

//switch : 조건문 if else 반복 대체 = 다중 if문
//주사위 굴리기

public class switchTest1 {
    public static void main(String[] args) {

        int num = (int) (Math.random() * 6 + 1);

        //int num = 3;
        
        switch (num) {
            case 1:
                System.out.println("주사위 1번이 나왔습니다.");
                break;
            case 2:
                System.out.println("주사위 2번이 나왔습니다.");
                break;
            case 3:
                System.out.println("주사위 3번이 나왔습니다.");
                break;
            case 4:
                System.out.println("주사위 4번이 나왔습니다.");
                break;
            case 5:
                System.out.println("주사위 5번이 나왔습니다.");
                break;
            default:
                System.out.println("주사위 6번이 나왔습니다.");
                break;
        }

    }
}
