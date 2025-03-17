package io;

import java.io.File;

public class FileEx1 {
    public static void main(String[] args) {
        // 파일 객체 생성
        File file1 = new File("c:\\temp\\test1.txt"); // "\" : 이름 구분자
        File file2 = new File("c:\\temp", "test1.txt");

        File dir = new File("c:\\temp");
        File file3 = new File(dir, "c:\\temp");

        System.out.println("경로를 제외한 파일명 : " + file1.getName()); // test.txt

        // String[] fileName = file1.getName().split("\\.");
        // System.out.println("확장자를 제외한 파일명 : " + fileName[0]);

        String fileName = file1.getName();
        System.out.println("확장자를 제외한 파일명 : " + fileName.substring(0, fileName.lastIndexOf("."))); // test

        int pos = fileName.lastIndexOf(".");
        System.out.println("확장자 : " + fileName.substring(pos)); // .txt

        System.out.println("경로를 포함한 파일명 : " + file1.getPath()); // c:\temp\test1.txt
        System.out.println("파일의 절대 경로 : " + file1.getAbsolutePath()); // = getPath()

        // 경로구분자
        System.out.println("File.pathSeparator : " + File.pathSeparator); // ;
        System.out.println("File.pathSeparatorChar : " + File.pathSeparatorChar); // ;
        // 이름구분자
        System.out.println("File.separator : " + File.separator); // \
        System.out.println("File.separatorChar : " + File.separatorChar); // \

    }
}
