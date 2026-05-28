import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack stack = new Stack<>();

        // s를 순회하면서
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (stack.isEmpty() && c == ')') {
                return false;
            }

            if (c == '(') { // s = "(" 이면 스택에 push
                stack.push(c);
            } else { // s = ")"이면 스택에서 pop
                stack.pop();
            }
        }

        // 순회가 끝났는데 stack의 사이즈가 0이면 true, 0보다 크면 false
        if (stack.size() > 0) {
            answer = false;
        }

        return answer;
    }
}