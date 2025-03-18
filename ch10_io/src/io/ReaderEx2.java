package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class ReaderEx2 {
    public static void main(String[] args) {
        // 서브 스트림 사용, 문자기반 데이터 읽기 (Reader, Writer)
        try (Reader reader = new FileReader("c:/temp/file1.txt", Charset.forName("utf-8"));
                BufferedReader br = new BufferedReader(reader);
                Writer writer = new FileWriter("c:/temp/output2.txt", true);
                BufferedWriter bw = new BufferedWriter(writer);) {
            int data = 0;
            String str = "";
            char cbuf[] = new char[1024];
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine(); // \n

            }
        } catch (

        Exception e) {
            e.printStackTrace();
        }
    }
}
