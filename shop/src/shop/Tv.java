package shop;

public class Tv extends Product {

    private String resoulution; // 해상도

    // 생성자(제품명, 가격, 해상도)
    public Tv(String pName, int price, String resolution) {
        super(pName, price);
        this.resoulution = resolution;
    }

    @Override // 제품상세정보 출력
    public void printExtra() {
        System.out.println("해상도 : " + this.resoulution);
    }

}
