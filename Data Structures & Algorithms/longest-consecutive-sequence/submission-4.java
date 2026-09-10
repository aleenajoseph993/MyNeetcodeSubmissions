class Solution {
    public int longestConsecutive(int[] nums) {
     HashSet<Integer> numSet=new HashSet(); 
     for(int n:nums){
        numSet.add(n);
     }  
     int maxcount=0;
     for(int n:nums){
        int count=0;
        //find the start of sequence
        if(!numSet.contains(n-1)){
            
            while(numSet.contains(n+count)){
                count++;
            }
            
            
        }
        if(count>maxcount){
            maxcount=count;
        }
     }
     return maxcount;
    }
}
