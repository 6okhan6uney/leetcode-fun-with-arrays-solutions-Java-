class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int reader, writer, temp;
        writer = 0;
        
        if(nums.length == 1)
        {
            return nums;
        }
        
        for(reader = 0; reader < nums.length; reader++)
        {
            
            if(nums[reader]%2 == 0)
            {
                temp = nums[writer];
                nums[writer] = nums[reader];
                nums[reader] = temp;
                writer++;
            }
        }
        return nums;
    }
}