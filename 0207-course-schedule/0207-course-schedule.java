class Solution {
    public boolean canFinish(int num, int[][] arr) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<num;i++)
        {
            ArrayList<Integer>temp=new ArrayList<>();
            adj.add(temp);
        }
        for(int i=0;i<arr.length;i++)
        {
            adj.get(arr[i][1]).add(arr[i][0]);
        }
        boolean loopvisited[]=new boolean[num];
        boolean visited[]=new boolean[num];
        //Stack<Integer>stack=new Stack<>();
        for(int i=0;i<num;i++)
        {
            if(!visited[i])
            {
                
                if(solve(loopvisited,visited,adj,i))
                    return false;
            }
        }
        return true;
    }
    public static boolean solve(boolean loopvisited[],boolean visited[],ArrayList<ArrayList<Integer>>adj,int node)
    {
        visited[node]=true;
        loopvisited[node]=true;
        ArrayList<Integer>temp=new ArrayList<>(adj.get(node));
        for(int i=0;i<temp.size();i++)
        {
            int val=temp.get(i);
            //System.out.println("val is "+val);
            if(loopvisited[val])
            {
                //System.out.println("ere");
                return true;
            }
            else if(!visited[val])
            {
                if(solve(loopvisited,visited,adj,val))
                    return true;
            }
        }
        
        loopvisited[node]=false;
        return false;
        
    }
}