import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int a : arr) {
            // 빈 스택이면 push
            if (stack.isEmpty()) {
                stack.push(a);
                continue;
            }

            // 같으면 원소 무시
            if (stack.peek() == a) {
                continue;
            }

            // 다르면 스택에 push
            stack.push(a);
        }

        int[] answer = new int[stack.size()];
        for (int i = stack.size(); i > 0; i--) {
            answer[i-1] = stack.pop();
        }

        return answer;
    }
}