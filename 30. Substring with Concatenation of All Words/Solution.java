import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> indices = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String str : words) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        int length = words[0].length() * words.length;

        for (int i = 0; i <= s.length() - length; i++) {
            HashMap<String, Integer> temp = new HashMap<>(map);
            int size = temp.size();
            String str = s.substring(i, i + length);
            for (int j = 0; j <= str.length() - words[0].length(); j += words[0].length()) {
                String str2 = str.substring(j, j + words[0].length());
                if (temp.containsKey(str2) && temp.get(str2) > 0) {
                    temp.put(str2, temp.get(str2) - 1);
                    if (temp.get(str2) == 0) {
                        size--;
                    }
                } else {
                    break;
                }
            }
            if (size == 0) {
                indices.add(i);
            }
        }

        return indices;
    }
}
