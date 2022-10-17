//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans[] = new Solve().printUnsorted(arr, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}


// } Driver Code Ends


//User function Template for Java




class Solve {
    int[] printUnsorted(int[] arr, int n) {
        int last=0;
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=max)
                max=arr[i];
            else
                last=i;
        }
        int start=n-1;
        int min=arr[n-1];
        for(int j=n-1;j>=0;j--)
        {
            if(arr[j]<=min)
                min=arr[j];
            else
                start=j;
        }
        int ans[]=new int[2];
        if(start>last)
            return ans;
    ans[0]=start;
    ans[1]=last;
    return ans;
    }
}