class Solution {
    public boolean checkInclusion(String s1, String s2) {
    int windowsize=s1.length();
    
    char[] a = s1.toCharArray();
    Arrays.sort(a);
    for(int right=0;right<=s2.length()-windowsize;right++){
        String s=s2.substring(right,right+windowsize);
        char[] b = s.toCharArray();
        Arrays.sort(b);
        if (Arrays.equals(a, b)) {
                return true;
            }
        
    
    }   
    return false;    
    }
}
