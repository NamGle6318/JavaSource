package oop;

public class GoodsStock {
    // 속성 : code(상품코드), stockNum(재고수량)
    // 기능 : 재고의 수량을 추가한다 / 재고의 수량을 감소한다

    String code;
    int goodsStock;

    void stockSet(int goodsStock) {
        this.goodsStock = goodsStock;
    }

    void addStock(int num) { // 재고 수량1개추가
        this.goodsStock += num;
    }

    void minusStock(int num) { // 재고 수량1개감소
        this.goodsStock -= num;
    }

    @Override
    public String toString() {
        return "상품 코드 : " + code + "\n" + "재고 수량 : " + goodsStock;
    }

    public GoodsStock(String code, int goodsStock) {
        this.code = code;
        this.goodsStock = goodsStock;
    }

    public GoodsStock() {
    }

}