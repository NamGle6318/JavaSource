package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TrywithEx {
    public static void main(String[] args) {
        // resource를 닫는 방법 (1, 2)
        FileInputStream fis = null;

        // 1. finally 사용
        try {
            fis = new FileInputStream("file.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fis != null)
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

        // 2. try-with-resources : 자동 리소스 닫기 사용
        try (FileInputStream fis2 = new FileInputStream("file.txt");) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
