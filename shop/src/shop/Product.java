package shop;
// product, user 클래스 한 묵음 예제

// 쇼핑몰 운영
// product : 스마트폰, TV

public abstract class Product { // 추상 클래스
    private String pName;
    private int price;

    public void printDetail() { // 제품 정보를 출력
        System.out.println("제품명 : " + pName);
        System.out.println("가격 : " + price);
        printExtra();
    }

    public Product(String pName, int price) {
        this.pName = pName;
        this.price = price;
    }

    public abstract void printExtra(); // 제품 정보의 나머지를 출력

    public int getPrice() {
        return price;
    }

    public String getpName() {
        return pName;
    }

}
