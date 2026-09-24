class Solution {
    public int characterReplacement(String s, int k) {
    int freq[]=new int[26];
    int max=0;
    int left=0;
    int maxWindow=0;
    int maxfreq=0;
 
    for(int right=0;right<s.length();right++){
        freq[s.charAt(right)-'A']++;
        maxfreq=Math.max(maxfreq,freq[s.charAt(right)-'A']);
        int length=right-left+1;
        if(length-maxfreq>k){
            freq[s.charAt(left)-'A']--;
            left++;
        }
        length=right-left+1;
        maxWindow=Math.max(length,maxWindow);
    }
    return maxWindow;
    }
}
