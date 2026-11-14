class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            //agar contains nahi matlab unique
            if(!map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]));
            } else{
                //agar contains hai matlab dups hai
                return true;
            }
        }
        return false;
    }
}