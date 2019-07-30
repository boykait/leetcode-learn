package gxw;

/**
 * 20190730
 */
public class LC12 {
    public static void main(String[] args) {

    }

    public String intToRoman(int num) {
        StringBuilder sbr = new StringBuilder();
        int newNum = num - (num % 1000);
        // 处理千位
        if (num / 1000 == 9) {
            sbr.append("CM");
        } else if(num / 1000 == 0) {
            sbr.append("M");
        }

        // 处理百位
        num = num % 10;
        newNum = num - (num % 100);
        if (num / 500 == 4) {
            sbr.append("XL");
        } else if(num / 500 == 0){
            sbr.append("L");
        } else if(num / 100 == 9) {
            sbr.append("XL");
        }

        // 处理十位
        num = num % 10;
        newNum = num - (num % 100);
        if (num / 1000 == 9) {
            sbr.append("CM");
        } else {
            sbr.append("M");
        }
        // 处理个位
        num = num % 10;
        newNum = num - (num % 100);
        if (num / 1000 == 9) {
            sbr.append("CM");
        } else {
            sbr.append("M");
        }
        return "";

    }
}
