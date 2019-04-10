package study.leetcode.p300.no283;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements.
 * <p>
 * Example:
 * <p>
 * Input: [0,1,0,3,12]
 * <p>
 * Output: [1,3,12,0,0]
 * <p>
 * Note:
 * <p>
 * You must do this in-place without making a copy of the array.
 * <p>
 * Minimize the total number of operations.
 *
 * @see <a href="https://leetcode.com/problems/move-zeroes/description/">
 * Move Zeroes - LeetCode</a>
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int n = nums.length;
        int zeroIndex = 0;
        int currentIndex = 0;

        // 非零元素放到数组前面，后面的元素置零
        while (currentIndex < n) {
            if (nums[currentIndex] != 0) {
                nums[zeroIndex] = nums[currentIndex];
                zeroIndex++;
            }
            currentIndex++;
        }

        while (zeroIndex < n) {
            nums[zeroIndex] = 0;
            zeroIndex++;
        }

    }

    public static void main(String[] args) {
        int test[] = {0, 1, 0, 3, 12};
        Solution solution = new Solution();
        solution.moveZeroes(test);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + ", ");
        }
    }
}