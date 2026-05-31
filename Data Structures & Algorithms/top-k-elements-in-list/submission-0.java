class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     HashMap<Integer,Integer> frq=new HashMap<>();
     for(int n:nums){
        frq.put(n,frq.getOrDefault(n,0)+1);
     }
     List<Integer>[] bucket=new ArrayList[nums.length+1];
     int[] result = new int[k];
     for(int num: frq.keySet()){
            int freq=frq.get(num);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList() ;
                
            }
            bucket[freq].add(num);
           
     }
     int index = 0;
     for (int i = bucket.length - 1; i >= 0 && index < k; i--) {

            if (bucket[i] != null) {

                for (int num : bucket[i]) {
                    result[index++] = num;

                    if (index == k) {
                        break;
                    }
                }
            }
        }
  return result;
    }
}
