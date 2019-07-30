package gxw;

public class LC3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int max = 0, cur = 0;
        int[] cnt = new int[200];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            cnt[c]++;
            while (cnt[c] > 1) {
                if (cnt[c] == 1) {
                    break;
                }
                if (--cnt[s.charAt(cur)] > 1)
                    cnt[s.charAt(cur)]--;
                cur++;
            }
            max = Math.max(max, i - cur + 1);
        }
        return max;
    }
}
