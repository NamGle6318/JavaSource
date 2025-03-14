package api.util;

import java.util.List;
import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        List<String> list = new Stack<>();
        // List 메서드 : 추가.add() 제거.remove()
        // stack 메서드 : 추가.push() 제거.pop()
        Stack<String> stack = new Stack<>();
        stack.push("감");
        stack.push("사과");
        stack.push("바나나");
        stack.push("아보카도");
        stack.push("샤인머스켓");

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }

    }
}
