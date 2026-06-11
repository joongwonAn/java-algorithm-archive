import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        Integer[] nums = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(nums, (a, b) -> {
            String ab = "" + a + b;
            String ba = "" + b + a;
            return ba.compareTo(ab);
        });

//        String answer = "";
//        for (Integer num : nums) {
//            answer += "" + num;
//        }

        /*
         * 문자열을 반복적으로 이어붙일 때 SpringBuilder를 사용하는 것 추천
         * */
        StringBuilder sb = new StringBuilder();
        for (Integer num : nums) {
            sb.append(num);
        }
        String answer = sb.toString();

        if (answer.startsWith("0")) {
            answer = "0";
        }

        return answer;
    }
}