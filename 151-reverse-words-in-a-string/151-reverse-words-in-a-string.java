class Solution {
    public String reverseWords(String str) {
        String ans="";
        int n=str.length();
        String word="";
        for(int i=n-1;i>=0;i--)
        {
            char ch=str.charAt(i); 
            //System.out.println("i is "+i+" ch is "+ch);
            if(ch==' ')
            {
                if(word!="")
                {
                if(ans!="")
                    ans+=" ";
                ans+=word;
                word="";
                //System.out.println(ans);
                }
            }
            else
            {
                word=ch+word;
            }
        }
        
        if(word!="")
        {
            //System.out.println("word is "+word);
            
            if(ans!="")
                ans+=" ";
            ans+=word;
        }
        return ans;
    }
}