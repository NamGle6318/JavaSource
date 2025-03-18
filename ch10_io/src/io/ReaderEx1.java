package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class ReaderEx1 {
    public static void main(String[] args) {
        // 문자기반 데이터 읽기 (Reader, Writer)
        try (Reader reader = new FileReader("c:/temp/file1.txt", Charset.forName("utf-8"));
                Writer writer = new FileWriter("c:/temp/output2.txt", true)) { // append true = 내용 얹혀 쓰기
            int data = 0;
            char cbuf[] = new char[1024];
            while ((data = reader.read(cbuf)) != -1) {
                // System.out.print(cbuf);
                writer.write(cbuf);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
