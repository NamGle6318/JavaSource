package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx1 {
    public static void main(String[] args) {
        // 파일에서 입력 받기 (System.out.print()/ File.write())
        FileInputStream fis = null;
        FileOutputStream fos = null;
        int data = 0;
        try {
            fis = new FileInputStream("c:/temp/file1.txt");
            fos = new FileOutputStream("c:/temp/output1.txt");
            while ((data = fis.read()) != -1) { // 1byte씩 입력받음
                char ch = (char) data;
                // System.out.print(ch); //abcdefg \n ?°??????¤??¼?§??°???? => 받은 바이트 값을 문자로 변환후
                // 출력
                fos.write(ch); // 파일복사 => 받은 값을 바이트 값 그대로 저장
                // write와 sout의 차이

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
