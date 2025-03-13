package api.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d); // Thu Mar 13 13:05:19 KST 2025

        // 데이터 형식
        // yyyy : 년도 2025, yy : 25
        // MM : 03
        // dd : 13
        // hh : 시
        // mm : 분
        // ss : 초
        // a : AM/PM
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(d)); // 2025-03-13

        sdf = new SimpleDateFormat("yyyy년MM월dd일 E요일 a hh시mm분ss초 ");
        System.out.println(sdf.format(d)); // 2025년03월13일 오후 01시11분54초
    }
}
