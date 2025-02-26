package op;

//사칙연산 char
//unicode로 a = 97 , A = 65

public class ArthmeticEx3 {
    public static void main(String[] args) {      
    
        char c1 = 'a';
        char c2 = c1;
        
                
        // int c3 = ' ';
        // c3 = c1 + 1; 
        // System.out.println(c3);

        char c3 = ' ';
        c3 = (char)(c1 + 1);
        System.out.println(c3);

        c2++;
        c2++;
        System.out.println(c2);
        int test = 1;

    }
    
}
