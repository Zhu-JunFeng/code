package org.example.day5;

/**
 * 统计n以内素数的个数。0和1除外
 * 例如：输入100.   输出25
 */
public class CountSuShu {

    public static void main(String[] args) {
        System.out.println(ViolentSolution(3));
    }


    //埃氏筛选
    public static int eratosthenes(int n) {
        boolean[] isPrimeNumber = new boolean[n];//false 代表素数
        int count = 0;
        return count;
    }

    //暴力解法
    public static int ViolentSolution(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            count += isPrimeNumber(i) ? 1 : 0;
        }
        return count;
    }

    //判断是否为素数
    public static boolean isPrimeNumber(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {//或者i < x
            if (x % i == 0)
                return false;
        }
        return true;
    }

}
