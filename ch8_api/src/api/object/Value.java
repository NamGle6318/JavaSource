package api.object;

public class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }

    @Override // 해당 클래스의 멤버변수 value를 비교값을 반환
    public boolean equals(Object obj) {
        Value v = (Value) obj;
        return this.value == v.value;
    }
    // toString() : 멤버 변수의 값을 출력하는 용도로 재정의

    @Override
    public String toString() {
        return value + ""; // int 타입 value를 String 타입으로 변환 후 반환
    }

}
