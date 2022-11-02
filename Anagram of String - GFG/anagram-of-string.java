//{ Driver Code Starts
//saksham raj seth
import java.util.*;
class Anagrams{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			GfG g=new GfG();
			System.out.println(g.remAnagrams(s,s1));
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG
{
	public int remAnagrams(String s1,String s2)
        {
            if(s1.length()<s2.length())
                return remAnagrams(s2,s1);
            int arr[]=new int[26];
            for(int i=0;i<s1.length();i++)
            {
                char ch=s1.charAt(i);
                arr[ch-97]+=1;
            }
            for(int i=0;i<s2.length();i++)
            {
                char ch=s2.charAt(i);
                arr[ch-97]-=1;
            }
            int count=0;
            for(int i=0;i<26;i++)
            {
                count+=Math.abs(arr[i]);
            }
            return count;
        }
}