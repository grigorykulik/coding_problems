/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.*/

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] indices=new int[2];

        int j=1;

        for (int i=0; i<nums.length-1; i++)
        {
            for (int k=j;k<nums.length; k++)
            {
                if (nums[i]+nums[k]==target)
                {
                    indices[0]=i;
                    indices[1]=k;
                }
            }

            j++;
        }
        return indices;
    }
}