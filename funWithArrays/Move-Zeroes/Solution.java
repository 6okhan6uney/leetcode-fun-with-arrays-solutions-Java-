class Solution {
    public void moveZeroes(int[] nums) {
        
        
        if(nums.length != 1)
        {
            int writePointer = 0, readPointer;
        
            for(readPointer = 0; readPointer < nums.length; readPointer++)
            {
                if(nums[readPointer] != 0)
                {
                nums[writePointer] = nums[readPointer];
                
                writePointer++;
                }
            }
            for(;writePointer < nums.length; writePointer++)
            {
                nums[writePointer] = 0;
            }
        }
    }
}