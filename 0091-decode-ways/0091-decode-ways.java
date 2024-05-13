class Solution {
   public int numDecodings(String s) {
        HashMap<String,Integer> map=new HashMap<>();
         if(s.charAt(s.length()-1)!='0'){
            map.put(s.charAt(s.length()-1)+"",1);
        }else{
            map.put(s.charAt(s.length()-1)+"",0);
        }
        for(int i=s.length()-2;i>=0;i--)
        {
           String str1=s.charAt(i)+"";
           String reString=s.substring(i+1);
           String finalStr=s.substring(i);
           isValid(map, finalStr, str1, reString);

           String str2=s.substring(i,i+2);
           String reString2=s.substring(i+2);
           isValid(map, finalStr, str2, reString2);
        }
        int res=map.get(s);
        return res;
    }
    public static void isValid(HashMap<String,Integer> map,String finalStr,String Str,String restStr)
    {
        if((Integer.parseInt(Str)!=0 && Str.charAt(0)!='0') && Integer.parseInt(Str)<27)
        {
            if((map.containsKey(restStr) && map.get(restStr)!=0))
            {
                    if(!map.containsKey(finalStr))
                    {
                        map.put(finalStr, map.get(restStr));
                    }else{
                        map.put(finalStr, map.get(finalStr)+map.get(restStr));
                    }
            }else if(restStr.equals("")){
                if(!map.containsKey(finalStr))
                    {
                        map.put(finalStr,1);
                    }else{
                        map.put(finalStr, map.get(finalStr)+1);
                    }
            }else{
                if(!map.containsKey(finalStr)){
                    map.put(finalStr, 0);
                }
            }
        }else if(Integer.parseInt(Str)==0 || Str.charAt(0)=='0'){
            map.put(finalStr, 0);
        }
    }
}