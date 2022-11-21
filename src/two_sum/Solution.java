package two_sum;

import java.util.ArrayList;

public class Solution {

    public void main(){
        int[] nums = new int[4];
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 15;

        twoSum(nums,9);

    }

    public int[] twoSum(int[] nums, int target) {

        int curNum;
        int[] result = new int[2];

        if (nums.length < 2 || nums.length > 10000) {
            System.out.println("Incorrect array size");
        }

        for (int i = 0; i < nums.length; i++) {

            curNum = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (j != i & nums[j] == target - curNum) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }

        }
        return  null;

    }
}
