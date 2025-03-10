package poly;

public class CaptionTvEx extends Tv2 {
    public static void main(String[] args) {
        // 부모 인스턴스 생성(CaptionTv 자식 클래스 참조)
        Tv2 tv = new CaptionTv();

        // Tv 클래스 참조
        tv.channel = 10;
        tv.channelUp();
        System.out.println(tv.channel);

        // CaptionTv 클래스 참조했으나 불가능 (인스턴스는 Tv를 참조하고 있을뿐임)
        // tv.displayCation("Hello Java");
        // tv.caption = true;
        // tv.displayCation("Hello Java");

        // 강제 형변환을 통해 사용을 잠깐 할 수는 있다.
        CaptionTv ctv = (CaptionTv) tv;
        ctv.displayCation("Hello Java");
        ctv.caption = true;
        ctv.displayCation("Hello Java");
    }
}
// Q. 생성된 인스턴스는 프로그램이 종료될때까지 힙에 남아 있을까?
// A. 참조가 유지되어 있는 한 Gc(가비지 콜렉터)가 없애지 않음. 즉 프로그램 종료시까지 남아 있을 수 있음.
// 단 인스턴의 값을 null로 지정하면 Gc에 의해 지워짐.