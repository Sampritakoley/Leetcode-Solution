class Solution {
    public static int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }

        // Create an array of HashMaps
        Map<Integer, Integer>[] dp = new HashMap[n];
        for (int i = 0; i < n; i++) {
            dp[i] = new HashMap<>();
        }
        int maxLength = 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int diff = nums[i] - nums[j];

                if (dp[j].containsKey(diff)) {
    dp[i].put(diff, dp[j].get(diff) + 1);
} else {
    // If the difference doesn't exist, initialize it to 2
    dp[i].put(diff, 2);
}

                maxLength = Math.max(maxLength, dp[i].get(diff));
            }
        }

        return maxLength;
    }
}