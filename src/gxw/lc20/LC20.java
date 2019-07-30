package gxw.lc20;

import java.util.Stack;

/**
 * 2019-07-30
 */
public class LC20 {
    public static void main(String[] args) {
        LC20 lc = new LC20();
        System.out.println(lc.isValid("(("));
    }

    /**
     * 利用stack栈进行判断
     * @param s s字符串
     * @return 判断结果
     */
    public boolean isValid(String s) {
        if (null == s || s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c.equals('(') || c.equals('{') || c.equals('[')) {
                stack.push(c);
            } else {
                if (!stack.empty()) {
                    Character pair = stack.pop();
                    if ((c.equals(')') && pair.equals('('))
                            || (c.equals('}') && pair.equals('{'))
                            || (c.equals(']') && pair.equals('['))) {
                        continue;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
