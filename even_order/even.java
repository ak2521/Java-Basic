import java.util.*;
public class even{
	public static void main(String[] args)
	{
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int ans=0;
		if(n%2==1)
		{
			ans=n-1;
		}
		else{
			ans=(n-1)/2;
		}

		System.out.println(ans);
	}
}