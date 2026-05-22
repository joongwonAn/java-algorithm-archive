import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> phoneBookSet = new HashSet<>();
        for (String p : phone_book) {
            phoneBookSet.add(p);
        }

        for (String p : phone_book) {
            for (int i = 1; i < p.length(); i++) {
                if (phoneBookSet.contains(p.substring(0, i))) {
                    return false;
                }
            }
        }

        return true;
    }
}