package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx3 {
    public static void main(String[] args) {
        // 파일에서 입력 받기 (try-with-resources 문 사용)
        int data = 0;
        byte[] b = new byte[1024];
        long start = System.currentTimeMillis();
        try (FileInputStream fis = new FileInputStream("c:/temp/sample2.jpg"); // 괄호안에 선언된 문장의 스트림을 자동으로 닫아줌
                FileOutputStream fos = new FileOutputStream("c:/temp/output2.jpg");) {

            // (data = fis.read()) != -1 // read() = 1byte씩 입력받음
            while ((data = fis.read(b)) != -1) { // = 1024byte씩 입력받음
                // char ch = (char) data;
                fos.write(b);

            }
            long stop = System.currentTimeMillis();
            System.out.println("복사하는데 걸린 시간 : " + (stop - start) + "ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
