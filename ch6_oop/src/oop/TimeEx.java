package oop;

public class TimeEx {
    public static void main(String[] args) {
        Time time = new Time();

        time.setHour(24);
        time.setMin(60);
        time.setSec(58f);

        System.out.println(" 시 : " + time.getHour());
        System.out.println(" 분 : " + time.getMin());
        System.out.println(" 초 : " + time.getSec());

        System.out.print("");
    }
}
