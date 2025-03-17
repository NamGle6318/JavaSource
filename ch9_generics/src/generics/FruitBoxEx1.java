package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Fruit {
    @Override
    public String toString() {

        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {

        return "Apple";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {

        return "Grape";
    }
}

// Fruit, Apple, Grape, Toy 다 참조 가능한 list 생성
class Box3<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    public ArrayList<T> getList() {
        return list;
    }

    int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

class Toy {
    @Override
    public String toString() {

        return "Toy";
    }
}

public class FruitBoxEx1 {

    // Comparator<String> c;

    public static void main(String[] args) {
        Box3<Fruit> fruitBox = new Box3<>();
        Box3<Apple> appleBox = new Box3<>();
        Box3<Grape> grapeBox = new Box3<>();
        Box3<Toy> toyBox = new Box3<>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple()); // Fruit - Apple (상속 관계)

        // 다형성에 어긋나지 않아야 함
        appleBox.add(new Apple());
        // appleBox.add(new Fruit());
        // appleBox.add(new Grape());
        // appleBox.add(new Toy());

        toyBox.add(new Toy());
        grapeBox.add(new Grape());

        // sort 대상 리스트, Comparator<? super Apple> c)
        // <? super Apple> : Apple클래스와 그 부모인 Fruit, Objects클래스만 가능
        List<Apple> list = new ArrayList<>();
        Collections.sort(list, null);
    }
}
