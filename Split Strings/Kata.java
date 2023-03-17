public class StringSplit {
    public static String[] solution(String s) {
        if(s.length()%2!=0)
        {
          s=s+'_';
        }
        String[] result =new String[s.length()/2];
        String str="";
        int pos=-1;
        for(int i=0;i<s.length();i++)
        {
          str=str+s.charAt(i);
          if((i+1)%2==0)
          {
            System.out.println(str);
            result[++pos]=str;
            str="";
          }
        }
    return result;
    }
}
