class Solution {
    public int heightChecker(int[] heights) {
        int arr[] = new int[heights.length];
        

        for(int i = 0; i < heights.length; i++)
        {
            arr[i] = heights[i];
        }
        for(int i = 0; i<heights.length; i++)
        {
            for (int j = 0; j < heights.length-1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        int counter=0;
        for(int i = 0; i < heights.length; i++)
        {
            if(heights[i] != arr[i])
            {
                counter++;
            }


        }
        return counter;
    }
}