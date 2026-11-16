class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int complement = -(nums[i] + nums[j]);

                if (seen.contains(complement)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                    Collections.sort(triplet); // Duplicates rokne ke liye sort karein
                    resultSet.add(triplet);
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(resultSet);
    }
}
