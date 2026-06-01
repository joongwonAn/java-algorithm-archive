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

            // Queue에 더 높은 우선순위가 있는지 확인
            boolean hasHigher = false;
            for (int[] q : queue) {
                if (q[1] > process[1]) {
                    hasHigher = true;
                    break;
                }
            }

            if (hasHigher) {
                queue.offer(process);  // 다시 뒤로
            } else {
                answer++;
                if (process[0] == location) {
                    return answer;
                }
            }
        }
        return answer;
    }
}

// 의사코드
// 큐(queue)에 [인덱스, 우선순위] 쌍으로 넣기
// 큐가 빌때까지 반복
// poll()로 맨 앞을 꺼내서
// 현재 큐 안에 더 높은 우선순위가 있으면, 다시 offer()
// 없으면 count++, 꺼낸 것의 인덱스 == location이면 count return