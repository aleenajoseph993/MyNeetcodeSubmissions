class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
       //sb=s;
       for (int i = 0; i < s.length(); i++) 
       { 
        char ch = s.charAt(i); 
        if (Character.isLetterOrDigit(ch))          {                                sb.append(Character.toLowerCase(ch));
         }
        }
        String og=sb.toString();
        sb.reverse();
        if(og.equals(sb.toString())){
            return true;
        }
        else{
            return false;
        }
    }
}
