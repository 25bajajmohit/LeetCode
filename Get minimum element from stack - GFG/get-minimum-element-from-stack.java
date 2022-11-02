//{ Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}



// } Driver Code Ends


class GfG
{
    int minEle;
    Stack<Integer> stack=new Stack<>();
    int min=Integer.MAX_VALUE;
    /*returns min element from stack*/
    int getMin()
    {
        if(stack.isEmpty())
            return -1;
	    return min;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	   if(stack.isEmpty())
	        return -1;
	  // System.out.println("stack peek is "+stack.peek()+" min is "+min);
	   if(stack.peek()>=min)
	        return stack.pop();
	   int item=min;
	   int val=stack.pop();
	   min=(2*min)-val;
	   
	   return item;
    }

    /*push element x into the stack*/
    void push(int x)
    {
	    if(stack.size()==0)
	    {
	        min=x;
	        stack.push(x);
	    }
	    else if(x>=min)
	    {
	        stack.push(x);
	    }
	    else
	    {
	        
	        stack.push((2*x)-min);
	        min=x;
	    }
    }	
}

