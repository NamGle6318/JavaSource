package oop;

import java.time.LocalDate;

// 날짜를 담는 타입 : localDate

public class Product {
    // 속성
    // 제품 번호, 제품명, 가격, 제조년월일(0000/00/00)

    String productNumber = "null";
    String product = "null";
    int price = 0;
    LocalDate regiDate;

    // 기능 - 가격을 변경하다
    void changePrice() {

    }

    // 생성자

    @Override
    public String toString() {
        return "Product [productNumber=" + productNumber + ", product=" + product + ", price=" + price + ", regiDate="
                + regiDate + "]";
    }

}
