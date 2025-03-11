package shop;

public class MyshopEx {
    public static void main(String[] args) {
        Ishop shop = new Myshop();
        shop.setTitle("전자제품 매장");
        shop.genUser();
        shop.genProduct();
        shop.start();
    }
}
