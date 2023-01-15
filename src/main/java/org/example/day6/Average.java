package org.example.day6;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        double[] arr = {4000,3000,1000,2000};
        double average = average(arr);
        System.out.println(average);
    }
    public static double average(double[] salary){
        Arrays.sort(salary);
        double sum = 0;
        for (double i : salary) {
            sum += i;
        }
        return (sum-salary[0]-salary[salary.length-1])/(salary.length-2);
    }

}
