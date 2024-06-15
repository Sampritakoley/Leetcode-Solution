class Solution {
    public int longestValidParentheses(String s) {
        int open=0;
        int close=0;
        int i=0;
        int max=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
            }else{
                close++;
            }
            if(close==open){
                max=Math.max(max,open*2);
            }else if(close>open){
                open=0;
                close=0;
            }
            i++;
        }
        
        open=0;
        close=0;
        i=s.length()-1;
        while(i>=0){
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
            }else{
                close++;
            }
            if(close==open){
                max=Math.max(max,open*2);
            }else if(open>close){
                open=0;
                close=0;
            }
            i--;
        }
        return max;
    }
}