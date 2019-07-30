package gxw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC17 {
    public static void main(String[] args) {
        letterCombinations("123");
    }

    public static List<String> letterCombinations(String digits) {
        if (null == digits || digits.length() == 0) {
            return new ArrayList<>();
        }
        List<String> list = Arrays.asList("", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz");
        List<String> targetList = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            char c = digits.charAt(i);
            targetList.add(list.get(Integer.valueOf(c + "") - 1));
        }

        List<String> result = new ArrayList<>();
        combine(targetList, "", 0, result);
        return result;
    }

    private static void combine(List<String> targetList, String lastStr, int curr, List<String> resultList) {
        if (curr == targetList.size()) {
            resultList.add(lastStr);
            return;
        }
        for (int i = 0; i < targetList.get(curr).length(); i++) {
            String str = lastStr + targetList.get(curr).charAt(i);
            combine(targetList, str, curr + 1, resultList);
        }
    }
}
