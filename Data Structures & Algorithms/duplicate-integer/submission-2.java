class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        //Step 1 Check karna agar value pehle se hai to true 
        //or nahi hai to false
        for(int num: nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}