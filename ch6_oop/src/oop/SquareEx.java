package oop;

import java.util.Arrays;

public class SquareEx {
    public static void main(String[] args) {

        Square[] squareArr = new Square[5]; // 객체배열
        squareArr[0] = new Square(5);
        squareArr[1] = new Square(6);
        squareArr[2] = new Square(7);
        squareArr[3] = new Square(8);
        squareArr[4] = new Square(9);
        // System.out.println(squareArr[0].getArea());
        // System.out.println(squareArr[1].getArea());
        // System.out.println(squareArr[2].getArea());
        // System.out.println(squareArr[3].getArea());
        // System.out.println(squareArr[4].getArea());
        for (int i = 0; i < squareArr.length; i++) {
            System.out.println(squareArr[i].getArea());
        }
        // System.out.println(Arrays.toString(squareArr)); null, null, null, null, null

        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 8;
        arr[4] = 9;
        // System.out.println(Arrays.toString(arr)); // 15, 0, 0, 0, 0

    }
}
