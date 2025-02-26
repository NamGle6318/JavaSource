package condition;

//조건식 if문 및 if else문
//if 형태 : if(조건문){조건문 결과가 true일 경우 실행}
//if else 형태 : if(조건문){조건문 결과가 true일 경우 실행} else{조건문 결과가 true가 아닐 경우 실행}

public class ifTest1 {
    public static void main(String[] args) {
        int x = 0;

        if(x == 0 ){
            System.out.println("x==0");
        }

        if(x != 0 ){
            System.out.println("x!=0");
        }

        if(!(x == 0 )){
            System.out.println("x==0");
        }

        if(!(x != 0 )){
            System.out.println("!(x!=0)");
        }
        
    }    
}
