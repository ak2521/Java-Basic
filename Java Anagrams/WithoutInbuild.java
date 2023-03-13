import java.io.*;
import java.util.*;
public class WithoutInbuild {
    public String ToLowerCase(String s)
    {
        int len=s.length();
        String out="";
        for(int i=0;i<len;i++)
        {   int x=s.charAt(i);
            if(x>=65 && x<=90)
            {
                x=x+32;
                out=out+(char)x;
            }
            else
            {
                out=out+s.charAt(i);
            }
        }
        return out;
    }
    public String Sort(String s)
    {
        char[] str=s.toCharArray();
        char temp;
        for(int i=0; i < str.length; i++) {
         for(int j=0; j < str.length; j++) {
            if(str[j] > str[i]) {
               temp = str[i];
               str[i] = str[j];
               str[j] = temp;
            }
         }
      }
        return String.valueOf(str);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        WithoutInbuild s =new WithoutInbuild();
        String s1=s.ToLowerCase(a);
        String s2=s.ToLowerCase(b);
        String sort1=s.Sort(s1);
        String sort2=s.Sort(s2);
        String result =(sort1.equals(sort2))?"Anagrams":"Not Anagrams";
        System.out.println(result);
        
    }
}

