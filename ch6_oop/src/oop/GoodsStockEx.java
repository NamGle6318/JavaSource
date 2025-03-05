package oop;

public class GoodsStockEx {
    public static void main(String[] args) {
        // new GoodsStock() : default 생성자를 호출하면서 인스턴스 생성
        GoodsStock goodsStock = new GoodsStock("p2345", 88);
        GoodsStock shoes = new GoodsStock("p1988", 100);
        GoodsStock no = new GoodsStock();

        // 속성 설정
        // goodsStock.code = "p1013";
        // goodsStock.goodsStock = 50;

        // 판매 -5
        goodsStock.minusStock(5);

        // 변수명이 겹치면 이해가 안되는거 조심
        System.out.println(goodsStock.goodsStock);
        System.out.println(goodsStock);

        // 제품 입고 + 10
        goodsStock.addStock(10);

        System.out.println(goodsStock);
        System.out.println(shoes);
        System.out.println(no);
    }
}
