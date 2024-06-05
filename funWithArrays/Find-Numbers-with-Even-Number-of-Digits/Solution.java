class Solution {
    public int findNumbers(int[] nums) {
        int i, num, counter = 0, digitcounter;
        
        for (i=0; i < nums.length; i++)
        {
            digitcounter = 0;
            num = nums[i];
            while(num != 0)
            {
                num = num/10;
                digitcounter++;
            }
            if(digitcounter % 2 == 0)
            {
                counter++;
            }
        }
        return counter;
    }
}