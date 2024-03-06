class Solution {
    public boolean isPalindrome(String s) {
        String newStr=removeSpecialChar(s);
        int length=newStr.length();
        int leftmid,rightmid;
        if(length==0 || length==1){
            return true;
        }
        if(length%2==0)
        {
             rightmid=newStr.length()/2;
             leftmid=rightmid-1;
        }else{
             int mid=newStr.length()/2;
             leftmid=mid-1;
             rightmid=mid+1;
        }
        boolean res=checkPalindrome(newStr, -1, length, leftmid, rightmid);
        return res;
    }
    public static boolean checkPalindrome(String s,int st, int end, int leftMid, int rightMid)
    {
        if(st==leftMid && end==rightMid && s.charAt(st)==s.charAt(end))
        {
            return true;
        }
        if(st==leftMid && end==rightMid && s.charAt(st)!=s.charAt(end))
        {
            return false;
        }
        st=st+1;
        end=end-1;
        boolean res=checkPalindrome(s, st, end, leftMid, rightMid);
        if(res)
        {
            if(s.charAt(st)==s.charAt(end))
            {
                return true;
            }
          return false;
        }
        return false;
    }
    public static String removeSpecialChar(String s)
    {
        String newStr="";
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))
                && !Character.isLetter(s.charAt(i))) {
                continue;
            }else{
                newStr+=s.charAt(i);
            }
        }
        return newStr.toLowerCase();
    }
}