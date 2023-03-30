import java.util.*;
class addCharacter {
    static String output="";
    public static void add(String s,int times)
    {
        for(int i=0;i<times;i++)
        {
            output+=s;
            
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        String str=sc.next();
        for(int i=0;i<str.length();i=i+2)
        {
            add(Character.toString(str.charAt(i)),Integer.parseInt(Character.toString(str.charAt(i+1))));
        }
        System.out.println(output);
    }
}
