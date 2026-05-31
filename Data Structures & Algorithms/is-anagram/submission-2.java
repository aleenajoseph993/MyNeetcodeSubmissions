class Solution {
    public boolean isAnagram(String s, String t) {
    //given string, so we need it to be convert as array to sort it
    if(s.length()!=t.length()){
        return false;
    }
    char a[]=s.toCharArray();
    char b[]=t.toCharArray();
    int ar[]=new int[26];
    for (int i=0;i<s.length();i++){
      ar[s.charAt(i)-'a']++;
      ar[t.charAt(i)-'a']--;
    }
    for(int val:ar){
        if(val!=0){
            return false;
        }
    }
    return true;
    }
}
