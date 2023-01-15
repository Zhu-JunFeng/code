package org.example.day3;

import java.util.Arrays;

/**
 * 整形数组nums ， 在数组中找出由三个数组成的最大乘积，并输出这个乘积。不考虑乘积越界。
 */
public class MaxProduct {
    public static void main(String[] args) {
        int[] nums = {-1, -200, 3, 4, 5, 6, 7};
        System.out.println(sort(nums));
        System.out.println(getMaxMin(nums));
        int n1 = Integer.MIN_VALUE;
        int n2 = Integer.MAX_VALUE;
        System.out.println(n1);
        System.out.println(n2);
    }

    /**
     * 这种方法时间复杂度为： NLogN
     *
     * @param nums
     * @return
     */
    public static int sort(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);//复杂度为NLogN  较高。
        return Math.max(nums[0] * nums[1] * nums[length - 1], nums[length - 1] * nums[length - 2] * nums[length - 3]);
    }

    /**
     * 线性扫描   时间复杂度是 ： O（n）
     *
     * @param nums
     * @return
     */
    public static int getMaxMin(int[] nums) {
        int min1 = Integer.MAX_VALUE;//定义一个最小的值
        int min2 = Integer.MAX_VALUE;//定义一个第二小的值
        int max1 = Integer.MIN_VALUE;//定义一个最大的值
        int max2 = Integer.MIN_VALUE;//定义一个第二大的值
        int max3 = Integer.MIN_VALUE;//定义一个第三大的值
        for (int x : nums) {
            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2) {
                min2 = x;
            }
            if (x > max1) {
                max3 = max2;
                max2 = max1;
                max1 = x;
            } else if (x > max2) {
                max3 = max2;
                max2 = x;
            } else if (x > max3) {
                max3 = x;
            }
        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
}
