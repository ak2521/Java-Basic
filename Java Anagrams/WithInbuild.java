import java.io.*;
import java.util.*;
public class WithInbuild {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        a=a.toLowerCase();
        b=b.toLowerCase();
        char[] str1=a.toCharArray();
        char[] str2=b.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        if(String.valueOf(str1).equals(String.valueOf(str2)))
        {
          System.out.print("Anagrams");  
        }
        else
        System.out.print("Not Anagrams");
    }
}

