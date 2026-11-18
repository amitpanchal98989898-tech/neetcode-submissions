class Solution {
    public int maxArea(int[] heights) {
        int maxContainer = 0;
        int left = 0;
        int right = heights.length - 1;

        while(left < right){
            int wd = right - left;
            int ht = Math.min(heights[left], heights[right]);
            int currWater = wd * ht;
            maxContainer = Math.max(maxContainer, currWater);

            //Konsa Pointer update hoga uske liye
            if(heights[left] < heights[right]){
                left++;
            } else{
                right--;
            }
        }
        return maxContainer;
    }
}
