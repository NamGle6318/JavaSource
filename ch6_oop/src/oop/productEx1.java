package oop;

import java.time.LocalDate;

public class productEx1 {
    public static void main(String[] args) {

        // 인스턴스 생성
        // 생성자 호출 : default
        Product product1 = new Product();

        // 초기화 [일일이 할 경우]
        product1.productNumber = "p12345678";
        product1.product = "밥솥";
        product1.price = 189000;
        product1.regiDate = LocalDate.now();

        System.out.println(product1);
    }
}
