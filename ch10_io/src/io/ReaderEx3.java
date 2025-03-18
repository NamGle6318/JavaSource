package io;

import java.io.Reader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.nio.charset.Charset;
// import java.io.Writer;
// import java.io.FileWriter;
// import java.io.BufferedWriter;

public class ReaderEx3 {
    public static void main(String[] args) {
        // 서브 스트림 사용, 문자기반 데이터 읽어서 화면에 출력 (Reader, Writer)
        try (Reader reader = new FileReader("./ch10_io/src/io/FileEx1.java", Charset.forName("utf-8"));
                BufferedReader br = new BufferedReader(reader);) {
            int data = 0;
            int i = 1;
            String str = "";
            char cbuf[] = new char[1024];
            while ((str = br.readLine()) != null) {
                System.out.print(i + "." + str + "\n");
                i++;
            }
        } catch (

        Exception e) {
            e.printStackTrace();
        }
    }
}
