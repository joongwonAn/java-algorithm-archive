import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        /// participant를 hashMap에 이름:등장횟수로 저장한다.
        /// (동명이인이 있을 수 있으므로 hashMap)
        HashMap<String, Integer> map = new HashMap<>();
        for(String name: participant){
            map.put(name, map.getOrDefault(name, 0)+1);
        }

        /// completion을 순회하면서 hashMap에서 1씩 뺀다
        for(String name: completion){
            map.put(name, map.getOrDefault(name, 0)-1);
        }

        /// hashMap에서 값이 1인 사람을 return
        String answer = "";
        for (String name: participant) {
            ///if(map.get(name) == 1){
            if(map.get(name) >= 1){ /// 방어적 코드
                answer = name;
                break;
            }
        }

        return answer;
    }
}