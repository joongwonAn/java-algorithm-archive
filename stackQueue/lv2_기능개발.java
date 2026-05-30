import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        int[] days = new int[progresses.length];

        // 작업 일수 계산(days)후, 큐에 offer
        for (int i = 0; i < progresses.length; i++) {
            days[i] = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            queue.offer(days[i]);
        }

        List<Integer> result = new ArrayList<>();
        int count = 1;
        int pivot = queue.poll();
        // Queue가 빌 때까지 반복
        while (!queue.isEmpty()) {
            // poll() 로 기준값 꺼내기, count = 1
            // peek() 값이 기준값보다 작거나 같으면 → poll(), count++
            // 아니면 → count를 결과에 추가하고 다음 기준값으로
            if (pivot >= queue.peek()) {
                queue.poll();
                count++;
            } else {
                result.add(count);
                pivot = queue.poll();
                count = 1;
            }
        }
        result.add(count);

        int[] answer = result.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
