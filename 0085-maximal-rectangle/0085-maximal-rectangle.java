class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[] height=new int[matrix[0].length];
        for(int i=0;i<matrix[0].length;i++){
            height[i]=matrix[0][i]-'0';
        }
        int maxRectArea=maxArea(height);
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++){
                if((matrix[i][j]-'0')==1){
                  height[j]=height[j]+(matrix[i][j]-'0');
                }else{
                     height[j]=0;
                }
            }
            int a=maxArea(height);
            maxRectArea=Math.max(a,maxRectArea);
        }
        return maxRectArea;
    }
    public static int maxArea(int[] arr){
        int maxArea=0;
        int[] ps=findPreviousSmall(arr);
        int[] ns=findNextSmall(arr);
        for(int i=0;i<arr.length;i++){
            int area=(ns[i]-ps[i]-1)*arr[i];
            maxArea=area>maxArea?area:maxArea;
        }
        return maxArea;
    }
    public static int[] findPreviousSmall(int[] arr){
        Stack<Integer> s = new Stack<Integer>();
        int[] ps=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(s.size()!=0 &&  arr[s.peek()]>=arr[i]){
                s.pop();
            }if(s.size()==0){
                ps[i]=-1;
            }else{
                int ind=s.peek();
                ps[i]=ind;
            }s.push(i);
        }
        return ps;
    }
    public static int[] findNextSmall(int[] arr){
        Stack<Integer> s = new Stack<Integer>();
        int[] ns=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(s.size()!=0 &&  arr[s.peek()]>=arr[i]){
                s.pop();
            }if(s.size()==0){
                ns[i]=arr.length;
            }else{
                int ind=s.peek();
                ns[i]=ind;
            }s.push(i);
        }
        return ns;
    }
}