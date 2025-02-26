package op;

//문자열(python이나 JS랑 개념이 똑같기 때문에 중요)
//객체타입
//equals , equalsIgnoreCase 

public class CompareEx3 {
    public static void main(String[] args) {
        String str1 = "abc";        //파생
        String str2 = "abc";
        String str3 = new String("abc"); //original

        System.out.printf("str1 == str2 = %b\n", (str1 == str2));
        System.out.printf("str1 == str3 = %b\n", (str1 == str3));

        System.out.printf("str1 == str1.equals(str3) = %b\n", (str1.equals(str3)));
        System.out.printf("str1 == equalsIgnoreCase(ABC) = %b\n", (str1.equalsIgnoreCase("ABC")));
        System.out.printf("str1 == equalsIgnoreCase(str3) = %b\n", (str1.equalsIgnoreCase(str3)));
        System.out.printf("str1 == equalsIgnoreCase(ABC) = %b\n", (str1.equalsIgnoreCase("ABC")));
    }
}
