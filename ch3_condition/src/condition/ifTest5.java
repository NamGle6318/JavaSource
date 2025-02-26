package condition;

//다중 else if문

public class ifTest5 {
    public static void main(String[] args) {

        int num = (int)(Math.random() * 6 + 1);
        System.out.println(num);

        if(num == 6 ){
            System.out.println("6이 나왔습니다.");

        }else if(num == 5){
            System.out.println("5가 나왔습니다.");
        
        }else if(num == 4){
            System.out.println("4가 나왔습니다.");
        
        }else if(num == 3){
            System.out.println("3이 나왔습니다.");
        
        }else if(num == 2){
            System.out.println("2가 나왔습니다.");
        
        }else{
            System.out.println("1이 나왔습니다.");
        
        }
    }    
}


//System.out.println(Math.random()) : 난수를 출력 (범위 : 0.0 <= Math.random() < 1.0)

//int num = (int)(Math.random()) * 6 + 1;
//Math.random() = 0.9 , num = 6;
//Math.random() = 0.8 , num = 5;
//Math.random() = 0.7 , num = 5;
//Math.random() = 0.6 , num = 4;
//Math.random() = 0.5 , num = 4;
//Math.random() = 0.4 , num = 3;
//Math.random() = 0.3 , num = 2;
//Math.random() = 0.2 , num = 2;
//Math.random() = 0.1 , num = 1;
