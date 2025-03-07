package oop;

import java.text.SimpleDateFormat;
import java.util.Date;

// import문

import java.util.Scanner;
import extend.Parent;

// 다른 패키지의 클래스를 인스턴스를 생성할때 import로 데려와야한다.
// import (패키지명).(클래스명);

// import를 사용하지 않는 패키지 
// java.lang.* (= 자동으로 import 처리 해줌)

import static java.lang.Math.*; // import 구문을 static으로 끌어올림 (Math 안 요소들이 전부 static 이기 때문에)

public class ImportEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parent parent = new Parent();

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("오늘 날짜는 : " + sdf.format(date));

        // static 클래스는 new로 안됨

        // 불러와도 import로 불러오지 않는 클래스들(=java.lang.Math)
        //
        System.out.println(Math.min(4, 5));
        System.out.println(Math.min(4, 5));
        System.out.println(min(PI, E));
        System.out.println(random()); // import static으로 Math의 메서드들을 사용할때 앞에 클래스명을 붙히지 않아도 됨

        String str; // (=java.lang.String)

        // Math : static 메서드로 선언되있음.

    }
}
