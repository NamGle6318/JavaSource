package io;

import java.util.Scanner;
import java.io.Writer;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
// import java.io.Reader;
// import java.io.BufferedReader;
// import java.nio.charset.Charset;

// 키보드에서 입력을 받고, 입력받은 내용을 파일에 저장
// 중단 : 사용자가 "Q"를 입력 시 입력을 중지

public class WriterEx1 {
    public static void main(String[] args) {

        String input = "";
        boolean check = true;
        try (Writer writer = new FileWriter("C:/temp/outputtest.txt", true);
                BufferedWriter bw = new BufferedWriter(writer);
                Scanner sc = new Scanner(System.in);) {

            while (check) {
                System.out.println("파일에 작성할 내용을 입력하세요.(중지 : Q)");
                input = sc.nextLine();
                if (input.equals("Q")) { // 입력받은값이 Q일경우 입력받기 종료
                    check = false;
                    continue;
                }
                bw.write(input);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
