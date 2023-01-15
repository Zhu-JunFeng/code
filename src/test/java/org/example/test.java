package org.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class test {


    /**
     * 在调用Arrays.sort()对数组进行排序时，默认是升序排序的，如果想让数组降序排序，有下面两种方法：
     * import java.util.*;
     *
     * Collections的reverseOrder：
     * public class Main {
     *     public static void main(String[] args) {
     * //        注意这里是Integer，不是int
     *         Integer[] arr={9,8,7,6,5,4,3,2,1};
     *         Arrays.sort(arr,Collections.reverseOrder());
     *         for(int i:arr){
     *             System.out.println(i);
     *         }
     *     }
     * }
     *
     * 或者利用Comparator接口复写compare：
     * public class Main {
     *     public static void main(String[] args) {
     *         Integer[] arr={9,8,7,6,5,4,3,2,1};
     *         Comparator cmp=new CMP();
     *         Arrays.sort(arr,cmp);
     *         for(int i:arr){
     *             System.out.println(i);
     *         }
     *     }
     * }
     * class CMP implements Comparator<Integer>{
     *     @Override //可以去掉。作用是检查下面的方法名是不是父类中所有的
     *     public int compare(Integer a,Integer b){
     * //        两种都可以，升序排序的话反过来就行
     * //        return a-b<0?1:-1;
     *         return b-a;
     *     }
     * }
     */
    @Test
    public void testArraysort(){
        Integer[] arr = {2,1,3,5,2,4,6,1,63,1,3,33,99};
        //Arrays.sort(arr);//升序
        Arrays.sort(arr, Collections.reverseOrder());//降序
        for (int i : arr) {
            System.out.print(i+"-");
        }
    }




    @Test
    public void ta(){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,11);
        map.put(2,22);
        map.put(3,33);
        map.put(4,44);
        map.put(55,5);
        boolean b1 = map.containsKey(55);
        boolean b2 = map.containsKey(1);
        boolean b3 = map.containsKey(6);
        boolean b4 = map.containsKey(5);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
