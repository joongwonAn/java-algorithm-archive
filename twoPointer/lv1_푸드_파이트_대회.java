import java.util.*;

// 의사코드
// StringBuilder 선언(-> sb)
// food를 순회하면서, food[i]/2번씩 i를 sb에 append
// answer = sb.toString() + "0" + sb.reverse().toString()

class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        // food: [1, 3, 4, 6]
        // answer: 1223330333221
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                sb.append(i);
            }
        }

        answer = sb.toString() + "0" + sb.reverse().toString();

        return answer;
    }
}