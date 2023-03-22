import java.util.*;
public class geometric_series{
	public static void main(String[] args)
	{
		Scanner c = new Scanner(System.in);
		int n=c.nextInt();
		long res=1;
		if(n%2==1)
		{
			n=(n+1)/2;
			res=(long)(1*Math.pow(2,n-1));
		}
		else{
			n=n/2;
			res=(long)(1*Math.pow(3,n-1));
		}
		System.out.println(res);		
	}
}