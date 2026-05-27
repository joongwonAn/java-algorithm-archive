import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int a : arr) {
            // 빈 스택이거나 peek과 다르면 push
            if (stack.isEmpty() || stack.peek() != a) {
                stack.push(a);
            }

        }

        int[] answer = new int[stack.size()];
        for (int i = stack.size(); i > 0; i--) {
            answer[i - 1] = stack.pop();
        }

        return answer;
    }
}