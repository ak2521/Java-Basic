import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner sc=new Scanner(System.in);
      String input=sc.next();
      char[] Vowels={'A','E','I','O','U','Y'};
      boolean isVowel=true;
      for(char i: Vowels)
      {
          if(input.charAt(2)==i)
          {
              isVowel=false;
          }      
      }
      if(input.charAt(2)=='X')
        {
            isVowel=true;
        }
      if(isVowel  
                && (input.charAt(0)-'0' + input.charAt(1)-'0')%2 == 0
                && (input.charAt(3)-'0' + input.charAt(4)-'0')%2 == 0
                && (input.charAt(4)-'0' + input.charAt(5)-'0')%2 == 0
                && (input.charAt(7)-'0' + input.charAt(8)-'0')%2 == 0)
      {   
          System.out.println("valid");
      }
      else
      {
          System.out.println("invalid");
      }
    }
}

