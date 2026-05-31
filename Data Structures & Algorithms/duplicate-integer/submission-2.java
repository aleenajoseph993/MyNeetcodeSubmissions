class Solution {
    public boolean hasDuplicate(int[] nums) {
        // for(int num:nums){
        //     int count=0;
        //     for(int i=0;i<nums.length;i++){
        //         if(num==nums[i]){
        //             count++;
        //         }
        //         if(count>1){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // HashSet<Integer> hs=new HashSet<>();
        // for(int num:nums){
        //     boolean added=hs.add(num);
        //     if(!added){
        //         return true;
        //     }
        // }
        // return false;

        return Arrays.stream(nums).distinct().count()<nums.length;
    }
}
