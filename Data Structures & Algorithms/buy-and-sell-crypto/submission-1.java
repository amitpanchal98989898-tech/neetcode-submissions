class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int left = 0; // 'left' ab humara BUY day hai
        int right = 1; // UPDATE 1: 'right' ko n-1 ki jagah 1 se start kiya (SELL day, jo buy ke
                       // just baad hai)
        int ans = 0; // (lmin aur rmax variables ki ab zaroorat nahi hai)

        // UPDATE 2: Loop tab tak chalega jab tak 'right' array ke end tak na pahunch jaye
        while (right < n) {
            // UPDATE 3: Agar buying price (left) selling price (right) se kam hai, toh profit
            // nikalo
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                ans = Math.max(ans, profit);
            } else {
                // UPDATE 4: Agar 'right' par price aur bhi kam mil gaya, toh wahi naya buy day ban
                // jayega
                left = right;
            }

            // UPDATE 5: Sirf 'right' pointer ko aage badhayenge har step mein (right-- hata diya)
            right++;
        }

        return ans;
    }
}
