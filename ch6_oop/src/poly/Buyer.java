package poly;

public class Buyer {
    int money = 10000;
    int bonusPoint = 0;
    Product products[] = new Product[10]; // 구입한 제품을 담을 수 있는 배열(종류 : product와 상속인 제품들)
    // products 배열에 사용할 인덱스 변수
    int i = 0;

    // 물건 구매 (1개 단위)
    // void buy(Product product) { // 다형성 인스턴스를 생성하는것과 같음
    // // 물건구매 : 잔액 -= 구매할 물건의 가격
    // // 보너스 포인트 += 물건의 보너스포인트
    // if (money < product.price) {
    // System.out.println("잔액부족으로 구매 불가능");
    // return;
    // }
    // this.money -= product.price;
    // this.bonusPoint += product.bonusPoint;
    // System.out.println(product + "을/를 구매하였습니다.");
    // }

    // 물건 구매 (10개 단위)
    void buy(Product product) { // 다형성 인스턴스를 생성하는것과 같음
        // 물건구매 : 잔액 -= 구매할 물건의 가격
        // 보너스 포인트 += 물건의 보너스포인트
        if (money < product.price) {
            System.out.println("잔액부족으로 구매 불가능");
            return;
        }
        this.money -= product.price;
        this.bonusPoint += product.bonusPoint;
        // 구매한 물건을 products 배열에 추가
        products[i++] = product; // products에 구매한 품목의 product 인스턴스를 넣는 중
        System.out.println(product + "을/를 구매하였습니다.");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        // Products 구매한 물건의 총 가격과 상품 목록 만들기
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null)
                break;
            sum += products[i].price;
            itemList += products[i] + ", ";

        }

        System.out.println("구입하신 물품의 총 금액은 " + sum + " 만 원 입니다.");
        System.out.println("구입하신 제품은 총 " + itemList + " 입니다.");
    }
}
