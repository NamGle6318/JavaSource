package generics;

class FruitBox<T extends Fruit> extends Box3<T> {
    // FruitBox에 담을 수 있는 타입 : Fruit, Fruit 자식들만 허용
}

class Juicer {
    static Juice makeJuice(Box3<Fruit> box) {
        String tmp = "";
        for (Fruit f : box.getList()) {
            tmp += f + " ";
        }

        return new Juice(tmp);
    }
}

public class Juice {
    String name;

    // 생성자
    Juice(String name) {
        this.name = name + "Juice";
    }

    @Override
    public String toString() {
        return name;
    }
}
