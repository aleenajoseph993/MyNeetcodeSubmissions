class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int num:nums){
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(num==nums[i]){
                    count++;
                }
                if(count>1){
                    return true;
                }
            }
        }
        return false;
    }
}
