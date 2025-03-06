package oop;

public class TvEx {
    public static void main(String[] args) {

        Tv tv = new Tv();
        Tv2 tv2 = new Tv2(48, "Black");
        Tv3 tv3 = new Tv3();

        tv3.setSize(64);
        tv3.setColor("blue");
        System.out.println(tv3.getSize());

        // tv2.power();
        // tv2.channelUp(100);
        // // System.out.println(tv2);

    }
}
