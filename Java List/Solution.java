import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    List<Integer>lt=new ArrayList<Integer>();
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        lt.add(sc.nextInt());
    }
    int t=sc.nextInt();
    for(int i=0;i<t;i++)
    {
        String query=sc.next();
        if(query.equals("Insert"))
        {
            int index=sc.nextInt();
            int value=sc.nextInt();
            lt.add(index,value);
        }
        else
        {
            int index=sc.nextInt();
            lt.remove(index);
        }
    }
    for(int i:lt)
    {
        System.out.print(i+" ");
    }
    }
}

