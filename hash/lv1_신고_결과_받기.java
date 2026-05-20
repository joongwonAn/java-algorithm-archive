import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // HashSet으로 report 중복 제거
        HashSet<String> reportSet = new HashSet<>();
        System.out.println

        // 중복 제거된 report를 순회하면서
        // 1. HashMap(reporter) : 신고자 -> Set(신고한 사람들)
        // 2. HashMap(reported_count) : 신고당한 사람 -> 신고횟수

        //id 배열을 순회하면서 각 사람의 메일 수 계산
        // reporter에서 내가 신고한 사람들 꺼내기
        // 그 사람들이 reported_count에서 k 이상이면 +1
        // 결과를 id 순서대로 answer 배열에 저장

        int[] answer = {};
        return answer;
    }
}