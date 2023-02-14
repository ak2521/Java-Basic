//Zoos
import java.util.*;
class Zoos {
    public static void main(String args[] ) throws Exception {
        Scanner sc =new Scanner(System.in);
        String input = sc.next(); // Getting String Input
        int zcount=0,ocount=0;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='z')
            {
                 zcount++; //Counting The No Of z's
            }
            if(input.charAt(i)=='o')
            {
                 ocount++; //Counting The No Of o's
            }
        }
    if(ocount%2==0)
	{
        // if the count of o is even countinue
	}
	else
	{ 
        // If the o's count is 7, It will produce 3 on divding by 2
        // To Aovid This Problem 1 added to o's Count
		ocount=ocount+1;
	}

        if(zcount==ocount/2)
        {
            // If No of z = No of o / 2
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
    }
}

