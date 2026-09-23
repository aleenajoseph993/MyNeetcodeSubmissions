class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> h = new HashSet<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            char a = s.charAt(right);

            while (h.contains(a)) {
                h.remove(s.charAt(left));
                left++;
            }

            h.add(a);

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}