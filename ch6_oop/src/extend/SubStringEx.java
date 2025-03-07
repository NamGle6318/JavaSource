package extend;

//오버로딩 : 같은 생성자나, 같은 메서드를 동일하게 여러개 생성가능. 단 변수명의 타입이 달라야함.
//오버라이딩 : 상속관계인 두 클래스에게 서로 같은 제목의 메서드가 있을시 하위 클래스가 해당 메서드를 재정의한다는 표기

public class SubStringEx {
    public static void main(String[] args) {
        SubString obj = new SubString(); // 서순 : 부모인스턴스 생성 -> 자식인스턴스 생성

        // 자식과 부모 클래스에서 생성한 변수의 이름이 같다면?
        System.out.println("이름 : " + obj.name); // 성춘향 (인스턴스 생성문에서 클래스 타입 = subString)

        obj.list(); // 부모가 자식 클래스에게 코드를 넘겨줄때 겹쳐지는 이름이 있으면 자식이 자기거 덮어씀

    }
}
