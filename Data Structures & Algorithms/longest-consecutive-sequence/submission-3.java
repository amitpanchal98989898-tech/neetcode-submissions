class Solution {
    public int longestConsecutive(int[] nums) {
        //step 1 poora data set mai dalo
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }

        int best = 0;
        //fir start find karo
        for(int num: set){
            if(set.contains(num - 1)){
                //start na mile tab tak skip karo
                continue;
            }

            //ab current pe start aagaya hoga
            int curr = num;
            int len = 1;

            //jab tak num + 1 means aageki value mile len value and current badhao
            while(set.contains(curr + 1)){
                curr = curr + 1;
                len = len + 1;
            }

            //best mai jo maximum hai use rakho
            best = Math.max(best, len);
        }
        return best;
    }
}
