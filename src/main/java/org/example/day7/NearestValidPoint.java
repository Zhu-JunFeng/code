package org.example.day7;

/**
 * 给你两个整数x 和y，表示你在一个笛卡尔坐标系下的(x, y)处。同时，在同一个坐标系下给你一个数组points，
 * 其中points[i] = [ai, bi]表示在(ai, bi)处有一个点。当一个点与你所在的位置有相同的 x 坐标或者相同的 y 坐标时，我们称这个点是 有效的。
 * <p>
 * 请返回距离你当前位置曼哈顿距离最近的有效点的下标（下标从 0 开始）。如果有多个最近的有效点，请返回下标最小的一个。如果没有有效点，请返回-1。
 * <p>
 * 两个点 (x1, y1)和 (x2, y2)之间的 曼哈顿距离为abs(x1 - x2) + abs(y1 - y2)。
 * <p>
 * <p>
 * 示例 1：
 * 输入：x = 3, y = 4, points = [[1,2],[3,1],[2,4],[2,3],[4,4]]
 * 输出：2
 * 解释：所有点中，[3,1]，[2,4] 和 [4,4] 是有效点。有效点中，[2,4] 和 [4,4] 距离你当前位置的曼哈顿距离最小，都为 1 。[2,4] 的下标最小，所以返回 2 。
 * <p>
 * 示例 2：
 * 输入：x = 3, y = 4, points = [[3,4]]
 * 输出：0
 * 提示：答案可以与你当前所在位置坐标相同。
 * <p>
 * 示例 3：
 * 输入：x = 3, y = 4, points = [[2,3]]
 * 输出：-1
 * 解释：没有 有效点。
 * <p>
 * 提示：
 * 1 <= points.length <= 10^4
 * points[i].length == 2
 * 1 <= x, y, ai, bi <= 10^4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class NearestValidPoint {

    public static void main(String[] args) {
        int[][] nums = {{1,2},{3,1},{2,4},{2,3},{4,4}};
        int x = 3;
        int y = 4;
        int i = nearestValidPoint(x, y, nums);
        System.out.println(i);
    }

    public static int nearestValidPoint(int x, int y, int[][] points) {
        int res = -1;
        int t = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            int sum = 0;
            if (points[i][0] == x || points[i][1] == y) {//判断有效点
                sum = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (t>sum){
                    t=sum;
                    res = i;
                }
            }
        }
        return res;
    }
}
