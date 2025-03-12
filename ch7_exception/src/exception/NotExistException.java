package exception;

public class NotExistException extends Exception {
    // exception 만들기 (이름 바꾸기)

    // default 생성자
    public NotExistException() {
        super(); // = Exception class
    }

    // Throws 한걸 받아서 exception 클래스에 반환
    public NotExistException(String message) {
        super(message);
    }
}
