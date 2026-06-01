import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
        }

        int answer = 0;
        while (!queue.isEmpty()) {
            int[] process = queue.poll();

            if (queue.stream().anyMatch(q -> q[1] > process[1])) {
                queue.offer(process);
                continue;
            }

            answer++;
            if (process[0] == location) return answer;
        }
        return answer;
    }
}