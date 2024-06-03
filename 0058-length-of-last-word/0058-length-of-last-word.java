class Solution {
    public int lengthOfLastWord(String s) {
       int n=s.length();
       int result=0;
       while(n>0){
        n--;
        if(s.charAt(n) != ' '){
            result++;
        }
        else if(result>0)
        {
            return result;
        }
       } 
       return result;
        
    }
}