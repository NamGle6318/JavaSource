package shop;

import java.util.Scanner;

public class Myshop implements Ishop {
    private String title;
    private User[] users = new User[5]; // 여러개의 user를 저장(유저 목록을 출력할때 사용)
    private Product[] products = new Product[10]; // 여러개의 product를 저장 (제품 목록을 출력할때 사용)
    private Product[] cart = new Product[10]; // 구매를 결정한 제품들을 보관하는 배열
    private String userName;
    private int cartCount = 0;
    Scanner sc = new Scanner(System.in);

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUser() {
        users[0] = new User("망아지", PayType.CASH);
        users[1] = new User("송아지", PayType.CARD);
    }

    @Override
    public void genProduct() {
        products[0] = new Tv("Super ultra Tv", 10000000, "1024K");
        products[1] = new Tv("ultra super Tv", 1000000, "512K");
        products[2] = new CellPhone("알뜰폰", 50000, "SKT");
        products[3] = new CellPhone("학생폰", 100000, "U+");
        products[4] = new CellPhone("아이폰", 800000, "KT");
    }

    @Override
    public void start() {
        String input;
        int num = 0;
        int i = 0;
        System.out.printf("%s - 메인화면 - 계정선택\n", this.title);
        System.out.println("================================");
        for (User user : users) {
            if (user != null) {
                System.out.printf("[%d]%s(%s)\n", i, users[i].getName(), users[i].getPayType());
                i++;
            }
        }
        System.out.println("[x]종료");
        System.out.println("================================");
        System.out.print("선택 : ");

        input = sc.nextLine();

        switch (input) {
            case "x", "X":
                System.exit(0);
                break;
            case "0":
            case "1":
                userName = input;
                productList();
                break;
            default:
                System.out.println("입력을 재확인해주세요");
                start();
                break;
        }
    }

    public void productList() {
        String input;
        int num;
        int i = 0;
        // 상품목록칸 출력
        System.out.printf("%s - 상품목록 - 상품선택\n", this.title);
        System.out.println("================================");
        for (Product product : products) {
            if (product != null) {
                System.out.printf("[%d]", i);
                product.printDetail();
                System.out.println();
                i++;
            }
        }
        System.out.println("[h] 메인화면");
        System.out.println("[c] 체크아웃");
        System.out.println("================================");
        System.out.print("선택 :");
        input = sc.nextLine();
        switch (input) {
            case "0", "1", "2", "3", "4": // 해당 번호에 해당하는 제품을 cart에 담고 제품 목록을 출력한다
                num = Integer.parseInt(input);
                cart[cartCount] = products[num];
                cartCount++;
                productList();

            case "h":
                start();
                break;
            case "c":
                checkOut(cart);
                break;

            default:
                break;
        }

    }

    public void checkOut(Product[] cart) {
        int sum = 0; // cart에 담긴 제품들의 총 가격
        String input;

        // 총합 계산
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] != null) {
                sum += cart[i].getPrice();
            }
        }

        // 체크아웃 화면 출력
        System.out.printf("%s - %s - 체크아웃\n", this.title, users[Integer.parseInt(userName)].getName());
        System.out.println("================================");
        int i = 0;
        for (Product product : cart) {
            if (cart[i] != null) {
                System.out.printf("[%d]", i);
                cart[i].printDetail();
                System.out.println();
                i++;
            }
        }
        System.out.printf("결제 방법 : %s \n", users[Integer.parseInt(userName)].getPayType());
        System.out.printf("총합 : %d \n", sum);
        System.out.println("================================");
        System.out.println("[p] 이전");
        System.out.println("[q] 종료");
        input = sc.nextLine();
        switch (input) {
            case "p":
                productList();
                break;

            case "q":
                System.exit(0);
            default:
                System.exit(0);
        }
    }
}
