package exception;

public class WrongPasswordException extends Exception {
    // exception 만들기 (이름 바꾸기)

    // default 생성자
    public WrongPasswordException() {
        super();
    }

    // Throws 한걸 받아서 exception 클래스에 반환
    public WrongPasswordException(String message) {
        super(message);
    }
}
