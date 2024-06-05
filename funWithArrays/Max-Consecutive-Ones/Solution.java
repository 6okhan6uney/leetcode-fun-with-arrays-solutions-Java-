class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i, counter = 0, temp = 0, maxCons = 0;

        for(i=0; i<nums.length; i++)
        {
            //One counter
            if(nums[i] == 1)
            {
                counter++;
            }
            //Zero impact
            else
            {
                //Assing first consecutive block
                if(temp == 0)
                {
                    temp=counter;
                    maxCons = temp;
                    counter=0;
                }
                else
                {
                    if(counter>temp || counter == temp)
                    {
                        temp = counter;
                        maxCons = temp;
                        counter = 0;
                    }
                    else
                    {
                        counter = 0;
                    }
                }

            }
            if(i == (nums.length-1) && counter >= temp)
            {
                maxCons = counter;
            }
        }
        return maxCons;
    }
}