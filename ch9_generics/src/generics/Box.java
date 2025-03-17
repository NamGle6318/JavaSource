package generics;

public class Box {
    // Generic 미사용 Box 클래스
    Object item;

    public void setItem(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }
}

class BoxEx {
    public static void main(String[] args) {
        Box box = new Box();
        box.setItem(new String("자바"));
        String result = (String) box.getItem();

        box.setItem(Integer.valueOf(1));

        int i = (int) box.getItem();
    }
}
