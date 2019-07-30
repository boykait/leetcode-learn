package gxw;

public class LC7 {
    public static void main(String[] args) {
        int numRows = 3;
        String s = "PAYPALISHIRING";
        test(s, numRows);
    }

    public static String test(String s, int numRows) {
        if (numRows == 1) return s;
        int i = 1, k = numRows;
        int j = 0;
        StringBuilder sbr = new StringBuilder();
        while(k - i >= 0) {
            j = i - 1;
            while (j < s.length()) {
                sbr.append(s.charAt(j));
                if (i != k && i != 1) {
                    if (j + 2 * (k - i) < s.length()) {
                        sbr.append(s.charAt(j + 2 * (k - i)));
                    }
                }
                j += 2 * (k - 1);
            }
            i++;
        }
        return sbr.toString();
    }
}
