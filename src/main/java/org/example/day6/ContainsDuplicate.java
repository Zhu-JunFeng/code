package org.example.day6;

import java.util.HashMap;
import java.util.Map;

/**
 * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3,1]
 * 输出：true
 * 示例 2：
 *
 * 输入：nums = [1,2,3,4]
 * 输出：false
 *
 * 示例 3：
 *
 * 输入：nums = [1,1,1,3,3,4,3,2,4,2]
 * 输出：true
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/contains-duplicate
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ContainsDuplicate {
    public static void main(String[] args) {

    }
    public static boolean solution(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i))
                return true;
            map.put(i,i);
        }

        return false;
    }
}
