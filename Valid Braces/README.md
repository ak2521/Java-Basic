#Without Stack
public class BraceChecker {

  public boolean isValid(String braces) { 
    String b = braces;
    System.out.println(braces);   
    for(int i=0;i<braces.length()/2;i++)
    {
      b = b.replaceAll("\\(\\)", "");
      b = b.replaceAll("\\[\\]", "");
      b = b.replaceAll("\\{\\}", "");
      if(b.length() == 0)
        return true;
    }
    return false;
  }
}

<img width="1440" alt="Result" src="https://user-images.githubusercontent.com/105222251/225945090-d4a7537c-5636-42b2-bd5f-64cca8139811.png">
