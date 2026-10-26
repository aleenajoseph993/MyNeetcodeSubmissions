
class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int coverage = 0;
        int jumpIndex = 0;
        int dest = nums.length - 1;

        for (int i = 0; i < dest; i++) {
            coverage = Math.max(coverage, i + nums[i]);

            if (i == jumpIndex) {
                jumps++;
                jumpIndex = coverage;
            }
        }

        return jumps;
    }
}
