package api.util;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Queue 추가
        queue.offer(" 감");
        queue.offer(" 사과");
        queue.offer(" 바나나");
        queue.offer(" 아보카도");
        queue.offer(" 샤인머스켓");

        while (!queue.isEmpty()) {
            // 입구 -> 샤인머스켓, 아보카도, 바나나, 사과, 감 -> 출구
            System.out.println(queue.poll());
        }
    }
}
