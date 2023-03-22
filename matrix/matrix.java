import java.util.*;
class matrix{
	public static void main(String[] args)
	{
		Scanner c = new Scanner(System.in);
		int r = c.nextInt();
		int c1 = c.nextInt();
		int max=0;int max1=0;
		int[][] m = new int[r][c1];
		int[] c2 = new int[c1];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c1;j++)
				{
					m[i][j]=c.nextInt();
					if(m[i][j]==1)
						{
							c2[i]+=1;
						}		
				}
				//System.out.println(c2[i]);
				if(c2[i]>max)
					{
						max=c2[i];
						max1=i+1;
						
					}

		}

		System.out.println(max1);
					



	}
}