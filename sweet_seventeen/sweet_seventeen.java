import java.util.*;
public class sweet_seventeen{
	public static void main(String[] args)
	{
		Scanner c = new Scanner(System.in);
		int sum=0;
		String a = c.next();
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='A')
			{
				sum+=(10*Math.pow(17,a.length()-i-1));
			}
			else if(a.charAt(i)=='B')
			{
				sum+=(11*Math.pow(17,a.length()-i-1));
			}
			else if(a.charAt(i)=='C')
			{
				sum+=(12*Math.pow(17,a.length()-i-1));
			}
			else if(a.charAt(i)=='D')
			{
				sum+=(13*Math.pow(17,a.length()-i-1));
			}
			else if(a.charAt(i)=='E')
			{
				sum+=(14*Math.pow(17,a.length()-i-1));
			}
			else if(a.charAt(i)=='F')
			{
				sum+=(15*Math.pow(17,a.length()-i-1));
			}
			else if(a.charAt(i)=='G')
			{
				sum+=(16*Math.pow(17,a.length()-i-1));
			}
			else{
				sum+=(Integer.parseInt(a.substring(i,i+1))*Math.pow(17,a.length()-i-1));
			}
			//System.out.println(sum);
		}

		System.out.println(sum);
	}
}