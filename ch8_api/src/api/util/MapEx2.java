package api.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import api.object.Person;

public class MapEx2 {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("hong11", "홍길똥"));
        map.put(2, new Person("hong21", "제갈길똥"));
        map.put(3, new Person("hong31", "김길똥"));
        map.put(4, new Person("hong11", "최길똥"));

        Set<Integer> keySet = map.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            Person person = map.get(key);
            System.out.println(person);
        }

    }
}
