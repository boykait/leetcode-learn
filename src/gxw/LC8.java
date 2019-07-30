package gxw;

/**
 * 20190729
 */
public class LC8 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        if (null == height || height.length < 2) {
            return 0;
        }
        int max = 0;
        for (int i = 1; i < height.length; i++) {
            for (int j = 0; j < i; j++) {
                int minHeight = height[i] < height[j] ? height[i] : height[j];
                if (max < minHeight * (i - j)) {
                    max = minHeight * (i - j);
                }
            }
        }
        return max;
    }
}
