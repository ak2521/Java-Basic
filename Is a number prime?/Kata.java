import java.lang.*;
public class Prime {
  public static boolean isPrime(int num) {
    if(num<2)
    {
      return false;
    }
    else if(num==2)
    {
      return true;
    }
    else
    {
       int divisor=(int)Math.sqrt(num)+1;
       for(int i=2;i<divisor;i++)
       {
         if(num%i==0)
         {
            return false;
         }
       }
    }
    return true; 
  }
}
