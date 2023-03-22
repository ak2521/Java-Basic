import java.util.*;
public class prime_number{

	static boolean check(int input)
	{
		boolean flag =true;
		if(input==1)
			flag=false;
		for(int i=2;i<input/2;i++)
		{
			if(input%i==0)
			{
				flag=false;
				break;
			}
		}

		return flag;
	}
	public static void main(String[] args)
	{
		Scanner c = new Scanner(System.in);
		int input = c.nextInt();
		
		if(input>0)
		{
			System.out.println(check(input));	
		}
		else{
			System.out.println("Negative number :(");
		}
		
	}
}