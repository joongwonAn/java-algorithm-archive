import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // HashSet으로 report 중복 제거
        Set<String> reportSet = new HashSet<>();
        for (String r : report) {
            reportSet.add(r);
        }
//        System.out.println("reportSet: " + reportSet);

        // 중복 제거된 report를 순회하면서
        // -> HashMap(reporter) : 신고자 -> Set(신고한 사람들)
        Map<String, Set<String>> reporter = new HashMap<>();
        // -> HashMap(reportedCount) : 신고당한 사람 -> 신고횟수
        Map<String, Integer> reportedCount = new HashMap<>();
        for (String rs : reportSet) {
            String from = rs.split(" ")[0];
            String to = rs.split(" ")[1];

            // from 키가 없으면 새로운 HashSet 생성해서 넣기
            if (!reporter.containsKey(from)) {
                reporter.put(from, new HashSet<>());
            }

            // 기존 Set에 to 추가
            reporter.get(from).add(to);

            reportedCount.put(to, reportedCount.getOrDefault(to, 0) + 1);
        }
//        System.out.println("reporter: " + reporter);
//        System.out.println("reportedCount: " + reportedCount);

        int[] answer = new int[id_list.length];
        //id 배열 순회
        for (int i = 0; i < answer.length; i++) {
            String each = id_list[i];

            // -> reporter에서 내가 신고한 사람들 꺼내기
            for (String r : reporter.getOrDefault(each, new HashSet<>())) {
                // -> 만약 그 사람들이 reportedCount에서 k 이상이면 +1
                if (reportedCount.getOrDefault(r, 0) >= k) {
                    answer[i] += 1;
                }
            }
        }

        return answer;
    }
}