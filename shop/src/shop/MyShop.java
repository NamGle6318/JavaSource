package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShop implements IShop {

    private String title;
    // 고객 5명 저장가능한 배열 생성
    private User[] users = new User[5];

    // 제품 10 개 저장 가능한 배열 생성
    Product[] products = new Product[10];

    // // cart (제품 저장 가능한 배열)
    Product[] cart = new Product[10];

    Scanner sc = new Scanner(System.in);
    // start() 에서 선택된 user 보관 변수
    private String selUser;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUser() {
        // 2 명의 User 생성 후 배열객체에 담기
        users[0] = new User("홍길동", PayType.CARD);
        users[1] = new User("성춘향", PayType.CASH);

    }

    @Override
    public void genProduct() {
        // 5 개 제품 생성 후 배열객체에 담기(tv2개, cellphone 3)
        products[0] = new CellPhone("갤럭시 S25", 1260000, "SKT");
        products[1] = new CellPhone("아이폰", 1300000, "U+");
        products[2] = new Tv("LG 울트라 HD", 1270000, "4K");
        products[3] = new Tv("삼성 QLED", 2980000, "QLED");
        products[4] = new CellPhone("갤럭시 A3", 450000, "KT");

    }

    @Override
    public void start() {

        System.out.println(title + " : 메인화면 - 계정선택");
        System.out.println("=======================================");
        int i = 0;
        for (User user : users) {
            if (user != null) {
                System.out.printf("[%d] %s(%s)\n", i++, user.getName(), user.getPayType());
            }
        }
        System.out.println("[x] 종료");
        System.out.println("=======================================");
        System.out.print("선택 : "); // 0 or 1 or x

        String input = sc.nextLine();
        switch (input) {
            case "x":
            case "X":
                System.exit(0);
                break;
            case "0":
            case "1":
                // 사용자가 선택한 user 정보 담기(checkout() 메소드 필요)
                selUser = input;
                productList();
                break;
            default:
                System.out.println("입력을 확인해 주세요");
                start();
                break;
        }
    }

    public void productList() {

        System.out.println(title + " : 상품목록 - 상품선택");
        System.out.println("=======================================");
        int i = 0;
        for (Product product : products) {
            if (product != null) {
                System.out.printf("[%d]", i++);
                product.printDetail();
            }
        }
        System.out.println("[h] 메인화면");
        System.out.println("[c] 체크아웃");
        System.out.println("=======================================");
        System.out.print("선택 : ");

        // 0~4 or h or c
        String input = sc.nextLine();

        switch (input) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
                // cart 배열에 선택한 제품 담기
                for (int j = 0; j < cart.length; j++) {
                    // cart 빈 곳 찾기
                    if (cart[j] == null) {
                        // 사용자가 선택한 제품 담기
                        cart[j] = products[Integer.parseInt(input)];
                        break;
                    }
                }
                productList();
                break;
            case "h":
                start();
                break;
            case "c":
                checkout();
                break;
            default:
                break;
        }
    }

    public void checkout() {
        System.out.println(title + " : " + users[Integer.parseInt(selUser)].getName() + " - 체크아웃");
        System.out.println("=====================================");
        int i = 0, sum = 0;
        for (Product product : cart) {
            if (product != null) {
                System.out.printf("[%d] %s (%d)\n", i++, product.getPname(), product.getPrice());
                sum += product.getPrice();
            }
        }
        System.out.println("결제방법 : " + users[Integer.parseInt(selUser)].getPayType());
        System.out.println("합계 : " + sum);
        System.out.println("=====================================");
        System.out.println("[p] 이전");
        System.out.println("[q] 종료");
        System.out.print("선택 : "); // p => productList(), q => 종료

        String input = sc.nextLine();

        switch (input) {
            case "p":
                productList();
                break;
            case "q":
                System.exit(0);
                break;
            default:
                break;
        }

    }

}
