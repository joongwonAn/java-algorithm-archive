import java.util.*;

/*
의사코드:
1. 오름차순 정렬
2. 뒤에서부터 순회하면서
2-1.  조건: citations[i] >= citations.length - i
2-2.   조건 만족하면 → h 후보
3. return h
*/

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;

        for (int i = citations.length - 1; i >= 0 && citations[i] >= citations.length - i; i--) {
            answer = citations.length - i;
        }

        return answer;
    }
}