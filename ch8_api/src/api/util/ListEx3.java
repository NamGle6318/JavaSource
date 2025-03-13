package api.util;

import api.object.Person;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {
    public static void main(String[] args) {
        // Class 타입의 리스트
        List<Person> list = new ArrayList<>();
        list.add(new Person("alstjr123", "김민석"));
        list.add(new Person("1q2w3e4r!!!", "김세라"));
        list.add(new Person("1q2w3e4r@@@", "오재경"));
        list.add(new Person("1q2w3e4r###", "장재훈"));
        list.add(new Person("1q2w3e4r%%%", "곽재훈"));

        for (Person person : list) {
            System.out.println(person); // == person.toString;
            System.out.println();
        }

        // 아이디와 이름을 세로로 출력
        System.out.println("아이디\t\t이름");
        System.out.println("----------------------");
        for (Person person : list) {
            System.out.printf("%s\t%s\n", person.getId(), person.getName());
        }
    }
}
