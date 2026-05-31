class Solution {
    public boolean hasDuplicate(int[] nums) {
    boolean a=Arrays.stream(nums).distinct().count()<nums.length;
    return a;
    }
}
