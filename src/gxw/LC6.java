package gxw;

public class LC6 {
    public static void main(String[] args) {
        convert("PAYPALISHIRING", 3);
    }

    public static String convert(String s, int numRows) {
        boolean[] flags = new boolean[s.length()];
        int i = numRows;
        StringBuilder sbr = new StringBuilder();
        while (i >= 0) {
            int mod = 0;
            for (int j = numRows - i; j < s.length(); j++) {
                if (!flags[j]) {
                    if (mod++ % (i + 1) == 0) {
                        flags[j] = true;
                        sbr.append(s.charAt(j));
                    }
                }
            }
            i--;
        }
        return sbr.toString();
    }
}
