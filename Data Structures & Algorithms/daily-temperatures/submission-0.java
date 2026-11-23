class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int ans[] = new int[temperatures.length];
        int n = temperatures.length;
        int count = 0;
        int left = 0;
        int right = 1;
        while (left < n - 1) {
            while (right < n) {
                if (temperatures[left] < temperatures[right]) {
                    count++;
                    ans[left] = count;
                    break;
                } else {
                    right++;
                    count++;
                }
            }
            count = 0;
            left++;
            right = left + 1;
        }
        return ans;
    }
}