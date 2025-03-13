package api.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringEx4 {
    public static void main(String[] args) {
        StringEx4 obj = new StringEx4(); // static 안쓰려고 만듦
        String[] names = { "Queen", "Tod", "Kim", "Lee", "Choi" };

        int result = obj.findKim(names);
        System.out.println("Kim은" + result + "번째에 있다.");
    }

    public int findKim(String[] seoul) {
        // 반환 : "Kim" 은 3 번째에 있다.
        // int i;
        // for (i = 0; i < seoul.length; i++) {
        // if (seoul[i].equals("Kim")) {
        // break;
        // }
        // }
        // return "" + i;
        List<String> list = new ArrayList<>(Arrays.asList(seoul));
        return list.indexOf("Kim");
    }
}
