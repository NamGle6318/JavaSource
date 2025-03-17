package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// input :  int read() 
// output :  int write() 

public class InputStreamEx1 {
    public static void main(String[] args) {
        // InputStrema = 바이트스트림
        // 스트림(-) 생성 in - java / out - java
        InputStream in = System.in;
        OutputStream out = System.out;
        try {
            // read() : 한byte 입력 받아 int 로 돌려줌 -> while문 사용하여 반복 입력받기
            // int input = in.read(); // abc 입력
            // out.write(input); // a 출력

            // int input = 0;
            // while ((input = in.read()) != -1) {
            // out.write(input);
            // }

            // 바이트 단위를 정해서 입력받음
            byte[] b = new byte[1024];
            while ((in.read(b)) != -1) {
                out.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
