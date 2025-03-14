package generics;

public class Box2<T> {

    T item; // Generics

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

class BoxEx2 {
    public static void main(String[] args) {
        // T type 인스턴스 생성 방법
        Box2<String> box = new Box2<>(); //
        box.setItem("자바");
        String result = box.getItem();

        Box2<Integer> box2 = new Box2<>();
        box2.setItem(1);

        int i = (int) box2.getItem();
    }
}
