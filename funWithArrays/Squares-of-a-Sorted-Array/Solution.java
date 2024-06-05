class Solution {
    public int[] sortedSquares(int[] nums) {
        int i, j, num, square, temp;

        for(i=0; i< nums.length; i++)
        {
            num = nums[i];
            square = num*num;
            nums[i] = square;
        }
        for(j=0; j<nums.length; j++)
        {
           for(i=0; i<nums.length-1 ; i++)
            {
                if(nums[i]>nums[i+1])
                {
                temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
                }
            } 
        }
        
        return nums;
    }
}