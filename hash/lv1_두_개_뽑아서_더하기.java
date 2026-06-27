import java.util.*;

// 의사코드
// 1. 이중 for문을 돌면서 두 수의 합을 treeset에 담는다.
// 0 <= i < length-1, i < j < length
// 2. treeset에 담긴 값을 배열로 변환한다.
// 3. 배열로 변화된 배열을 return한다.

class Solution {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}