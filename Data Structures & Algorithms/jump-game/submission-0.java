class Solution {
    public boolean canJump(int[] nums) {
    int finalString=nums.length-1;
    for(int i=nums.length-2;i>=0;i--){
        if(i+nums[i]>=finalString){
            finalString=i;
        }
       // return true;
    }    
    return finalString==0;
    }
}
