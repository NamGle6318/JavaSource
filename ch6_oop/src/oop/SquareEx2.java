package oop;

import java.util.Arrays;

public class SquareEx2 {
    public static void main(String[] args) {

        Square[] squareArr = new Square[5]; // 객체배열
        // squareArr[0] = new Square(); // sideLength = 0;
        // squareArr[1] = new Square();
        // squareArr[2] = new Square();
        // squareArr[3] = new Square();
        // squareArr[4] = new Square();

        // sideLength : 입력
        for (int i = 0; i < squareArr.length; i++) {
            squareArr[i] = new Square();
        }

        for (int i = 0; i < squareArr.length; i++) {
            squareArr[i].sideLength = i + 3;
            System.out.print(squareArr[i].sideLength);
            System.out.print(" ");
            System.out.println(squareArr[i].getArea());
        }

    }
}
