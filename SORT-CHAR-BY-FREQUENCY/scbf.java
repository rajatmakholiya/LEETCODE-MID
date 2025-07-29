class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> hm = new HashMap<>();

        for (char p : s.toCharArray()) {
            hm.put(p, hm.getOrDefault(p, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(hm.entrySet());

        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            char ch = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}