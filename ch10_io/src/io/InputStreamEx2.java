package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// input :  int read() 
// output :  int write() 

public class InputStreamEx2 {
    public static void main(String[] args) {

        InputStream in = System.in;
        OutputStream out = System.out;
        try {
            System.out.print("이름 : ");
            byte[] b = new byte[1024];
            int input = in.read(b); // 1024바이트만큼 입력받음

            // String 객체 생성
            // enter : 캐리지리턴(13) + 라인피드(10) = 2byte
            String name = new String(b, 0, input - 2);
            System.out.print(name);

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
