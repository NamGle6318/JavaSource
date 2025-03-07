package extend;

// 오버라이딩
// 조건 :
// 1. 이름이 같다.
// 2. 매개변수가 같아야 한다.
// 3. 변환 타입이 같아야 한다.

// 부모클래스에서 정의해준 내용을
// 자식클래스에서 재정의 했다는걸 시스템에 알려주는 것 [표기용]



public class SubString extends ListString {
    String name = "성춘향";

    @Override
    public void list() {
        super.list(); // 부모 클래스의 메서드 실행
        System.out.println(name + " 하위 클래스 이름");
    }

    // public void print() {
    // list(); 해당 클래스의 메서드
    // super.list(); 해당 클래스의 부모 클래스의 메서드
    // exec(); // 상위와 하위끼리 겹치지 않음.
    // }
}
