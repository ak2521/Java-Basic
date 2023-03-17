import java.util.*;
public class Kata {
  public static String highAndLow(String numbers) {
    List<Integer> lt=new ArrayList<Integer>();
    numbers=numbers+" ";
    String str="";
    for(int i=0;i<numbers.length();i++)
      {
      
      if(numbers.charAt(i)!=' ')
        {
        str=str+numbers.charAt(i);
        }
      else
        {
          int x=Integer.parseInt(str);
          lt.add(x);
          str="";
      }
      }
    int max=lt.get(0);
    int min=lt.get(0);
    for(int i:lt)
      {
      if(max<i)
        {
        max=i;
      }
      
    }
    for(int i:lt)
      {
      if(i<min)
        {
        min=i;
      }
    }
  
      
    
    String out=String.valueOf(max)+" "+String.valueOf(min);
    return out;
  }
}
