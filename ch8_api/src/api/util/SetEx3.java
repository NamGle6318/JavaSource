package api.util;

import api.object.Person;
import java.util.HashSet;
import java.util.Set;

public class SetEx3 {
    public static void main(String[] args) {
        // Class 타입의 리스트
        Person hong = new Person("1234", "홍홍홍");
        Set<Person> set = new HashSet<>();
        set.add(new Person("alstjr123", "김민석"));
        set.add(new Person("alstjr123", "김민석")); // 객체의 인스턴스가 다르기 떄문에 해싱도 다르게 됨
        set.add(new Person("1q2w3e4r!!!", "김세라"));
        set.add(new Person("1q2w3e4r@@@", "오재경"));
        set.add(new Person("1q2w3e4r###", "장재훈"));
        set.add(new Person("1q2w3e4r%%%", "곽재훈"));
        set.add(hong);
        set.add(hong); // 같은 주소값을 가지고 있으므로 해싱도 같게 됨?

        for (Person person : set) {
            System.out.println(person); // == person.toString;
            System.out.println();
        }

        // str들의 equals + hashcode
        String str1 = "사과";
        String str2 = "사과";
        String str3 = new String("사과");
        System.out.println("str1.hashCode()" + str1.hashCode());
        System.out.println("str2.hashCode()" + str2.hashCode());
        System.out.println("str3.hashCode()" + str3.hashCode());
        System.out.println(new Person("1234", "홍홍홍").hashCode());
        System.out.println(new Person("1234", "홍홍홍").hashCode());
    }
}
