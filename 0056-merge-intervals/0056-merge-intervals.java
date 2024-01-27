class Solution {
    public int[][] merge(int[][] intervals)
    { 
       Stack<int[]> stack = new Stack<>();
       Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int[] arr=new int[2];
        arr[0]=intervals[0][0];
        arr[1]=intervals[0][1];
        stack.add(arr);
        for(int i=1;i<intervals.length;i++)
        {
            int[] popArr=stack.pop();
            int oldStart=popArr[0];
            int oldEnd=popArr[1];

            int newStart=intervals[i][0];
            int newEnd=intervals[i][1];

            if(oldEnd>=newStart)
            {
                int max=Math.max(oldEnd,newEnd);
                stack.add(new int[]{oldStart,max});
            }
            else{
                stack.add(popArr);
                stack.add(new int[]{newStart,newEnd});
            }
        }
        int[][] result=new int[stack.size()][2];
        for(int i=result.length-1;i>=0;i--)
        {
            int[] pop=stack.pop();
            result[i][0]=pop[0];
            result[i][1]=pop[1];
        }
        return result;
    }
}