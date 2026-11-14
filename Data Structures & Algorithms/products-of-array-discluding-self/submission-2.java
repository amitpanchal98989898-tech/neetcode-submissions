class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int res[] = new int[n];
        int prod = 1;

        //Step 1 left mai prefix
        for(int i=0; i<n; i++){
            left[i] = prod;
            prod = prod * nums[i];
        }

        //Step 2 right mai postfix
        prod = 1;
        for(int i = n-1; i>=0; i--){
            right[i] = prod;
            prod = prod * nums[i];
        }

        //Step 3 last res mai sab add kardo
        for(int i = 0; i<n; i++){
            res[i] = left[i]*right[i];
        }
        return res;
    }
}  
