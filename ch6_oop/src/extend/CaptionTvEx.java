package extend;

public class CaptionTvEx extends Tv {
    public static void main(String[] args) {
        // 부모 인스턴스 생성
        // Tv tv = new CaptionTv(); // 부모 클래스 타입으로 자식 클래스를 생성할 수 있으나, 자식클래스의 코드는 사용 불가능
        // todo
        Tv tv = new Tv();

        // 자식 인스턴스 생성 [CaptionTv 클래스는 Tv 클래스의 하위 클래스]
        CaptionTv captionTv = new CaptionTv();
        captionTv.channel = 10;
        captionTv.channelUp();
        System.out.println(captionTv.channel);

        captionTv.displayCation("Hello Java"); // captionTv의 caption = false인 상태
        captionTv.caption = true;
        captionTv.displayCation("Hello Java");
    }

}
// q. 부모 클래스와 자식클래스가 있을때 부모 클래스의 인스턴스를 생성안한 상태로 자식 클래스를 생성하면 부모 클래스의 코드를 사용할 수
// 있을까?
// a. 가능