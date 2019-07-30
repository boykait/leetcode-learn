package gxw;

public class LC5 {
    public static void main(String[] args) {
        longestPalindrome("");
    }

    public static String longestPalindrome(String s) {
        int maxLen = 1, start = 0, low, high, n = s.length();
        for (int i = 1; i < n; i++) {
            // 计算中心为单数的回文
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < n && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > maxLen) {
                    start = low;
                    maxLen = Math.max(maxLen, high - low + 1);
                }
                low--;
                high++;
            }
            // 计算中心为偶数的回文
            low = i - 1;
            high = i;
            while (low >= 0 && high < n && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > maxLen) {
                    start = low;
                    maxLen = Math.max(maxLen, high - low + 1);
                }
                low--;
                high++;
            }
        }
        StringBuilder sbr = new StringBuilder();
        for (int i = start; i < start + maxLen; i++) {
            sbr.append(s.charAt(i));
        }

        return sbr.toString();
    }
}

