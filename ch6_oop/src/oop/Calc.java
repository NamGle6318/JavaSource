package oop;

public class Calc {
    // 사칙연산을 수행하는 계산기 메서드 ( +, -, /, *)

    // 두 수를 더하기
    long add(long num1, long num2) {
        return num1 + num2;
    }

    long subtract(long num1, long num2) {
        return num1 - num2;
    }

    long multiply(long num1, long num2) {
        return num1 * num2;
    }

    double divide(int num1, int num2) {
        return (num1 / (double) num2);
    }

    long max(long num1, long num2) { // 무조건 return이 되야함
        return (num1 > num2) ? num1 : num2;
    }

    long min(long num1, long num2) { // 무조건 return이 되야함
        return (num1 < num2) ? num1 : num2;
    }
}
