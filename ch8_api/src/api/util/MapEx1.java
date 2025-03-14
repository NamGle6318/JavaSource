package api.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
    public static void main(String[] args) {
        // <K, V>
        Map<String, String> map = new HashMap<>();
        // 추가 (중복되는 key값은 덮어쓰기식)
        map.put("id_0111", "홍길동");
        map.put("id_0111", "김길동");
        map.put("id_0112", "고길동");
        map.put("id_0113", "최길동");
        map.put("id_0114", "제갈길동");

        // Key 값 가져오기
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
