import java.util.*;
public class word_is_a_key{
	public static void main(String[] args)
	{
		boolean flag = false;
		Scanner c = new Scanner(System.in);
		String str[]= {"break", "case", "continue", "default", "defer", "else","for", "func", "goto", 
     "if", "map", "range", "return", "struct", "type", "var"};
     String a = c.next();
     for(int i=0;i<str.length;i++)
     {
     	if(a.equals(str[i]))
     		flag=true;
     }

     if(flag==true)
     {
     	System.out.println(a+" is a keyword");
     }
     else{
     	System.out.println(a+" is not a keyword");
     }

	}
}