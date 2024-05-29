class Solution {
    public int numSteps(String s) {
        int carry=0;
        int ans=s.length()-1;
        for(int i=s.length()-1;i>0;i--)
        {
            char x=s.charAt(i);
            if(x-'0'+carry==1)
            {
                ans++;
                carry=1;
            }
            if(x-'0'+carry==2)
            {
                carry=1;
            }
        }
        if(carry==1)
        ans++;
        return ans;
        
    }
}