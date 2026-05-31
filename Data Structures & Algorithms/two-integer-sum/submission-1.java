class Solution {
    public int[] twoSum(int[] nums, int target) {
     HashMap<Integer,Integer> map=new HashMap();
     int out[]=new int[2];
     for(int i=0;i<nums.length;i++){
        int diff=target-nums[i];
       
        if(map.containsKey(diff)){
            out=new int[]{map.get(diff),i};
            return out;
        }
        map.put(nums[i],i);
     }

return new int[]{};
    }
    }