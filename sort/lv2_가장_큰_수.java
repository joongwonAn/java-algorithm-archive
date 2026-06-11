import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        Integer[] nums = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(nums, (a, b) -> {
            String ab = "" + a + b;
            String ba = "" + b + a;
            return ba.compareTo(ab);
        });

        String answer = "";
        for (Integer num : nums) {
            answer += "" + num;
        }

        if (answer.startsWith("0")) {
            answer = "0";
        }

        return answer;
    }
}