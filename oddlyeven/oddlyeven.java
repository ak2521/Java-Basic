import java.util.*;
public class oddlyeven{
	public static void main(String[] args)
	{
		Scanner c = new Scanner(System.in);
		int odd_sum=0;
		int even_sum=0;
		int inp = c.nextInt();
		String a = String.valueOf(inp);
		for(int i=0;i<a.length();i=i+2)
		{
			odd_sum+=Integer.parseInt(String.valueOf(a.charAt(i)));
		}
		for(int j=1;j<a.length();j=j+2)
		{
			even_sum+=Integer.parseInt(String.valueOf(a.charAt(j)));
		}
		System.out.println(Math.abs(even_sum-odd_sum));
	}
}