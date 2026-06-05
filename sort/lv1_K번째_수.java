import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;

        // commands를 순회하면서
        for (int[] command : commands) {
            // Arrays.copyOfRange()로 i+1(from)부터 j+2(to)까지 자르기
            int[] slice = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            // Arrays.sort()로 정렬
            Arrays.sort(slice);
            // k번째 수
            answer[index++] = slice[command[2] - 1];
        }

        return answer;
    }
}