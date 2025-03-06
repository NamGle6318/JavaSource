package oop;

// private 와 setter, getter은 단짝임

public class Time {
    // 시, 분, 초

    // 11 : 11 : 23초 이런 식으로 세팅
    private int hour;
    private int min;
    private float sec;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > 23 || hour < 0)
            return;
        else
            this.hour = hour;

    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min > 59 || min < 0)
            return;
        else
            this.min = min;
    }

    public float getSec() {
        return sec;
    }

    public void setSec(float sec) {
        if (sec > 59.99f || sec < 0.0f)
            return;
        else
            this.sec = sec;
    }

    // 생성자 : default

}
