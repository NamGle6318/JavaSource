package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx4 {
    public static void main(String[] args) {
        // 보조 스트림 사용하여 파일 입력받기 => bufferinputstream
        int data = 0;
        byte[] b = new byte[1024];
        try (FileInputStream fis = new FileInputStream("c:/temp/sample2.jpg");
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream("c:/temp/output2.jpg");
                BufferedOutputStream bos = new BufferedOutputStream(fos);) {

            while ((data = fis.read(b)) != -1) { // = 1024byte씩 입력받음
                fos.write(b);
            }
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
