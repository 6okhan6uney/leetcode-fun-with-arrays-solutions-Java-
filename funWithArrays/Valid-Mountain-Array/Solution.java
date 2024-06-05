class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean check = true;
        
        int i;
        
        for(i=1; i<arr.length; i++)
        {
            if(arr[i] == arr[i-1])
                return false;
            if(arr[i] < arr[i-1] && check)
            {
                if(i==1) return false;
                check = false;
            }
            else if (arr[i] > arr[i-1] && !check)
            {
                return false;
            }
        }
        return !check;
    }
}