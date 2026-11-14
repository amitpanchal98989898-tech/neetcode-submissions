class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int temp1 = 0;
        int temp2 = 1;
        for(int i = 0; i<n-1; i++){
            for(int j= i+1; j<n; j++){
                int ans = nums[i] + nums[j];
                if(ans == target){
                    temp1 = i;
                    temp2 = j;
                }
            }
        }
        int ans[] = {temp1, temp2};
        return ans;       
    }
}
