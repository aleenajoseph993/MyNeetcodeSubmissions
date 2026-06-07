class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix=new int[nums.length];
        int[] suffix=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            prefix[0]= 1; 
            prefix[i]=nums[i-1]*prefix[i-1];    
            
        }
        for(int i=nums.length-2;i>=0;i--){
            suffix[nums.length-1]=1; 
            suffix[i]=nums[i+1]*suffix[i+1];    
            
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=suffix[i]*prefix[i];
            
        }
        return nums;
    }
}  
