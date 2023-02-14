import java.util.*;
class Divisibility {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int n,LastElement=0;
        n = s.nextInt(); // Getting No Of Inputs n
        for(int i=0;i<n;i++)
        {
            LastElement = s.nextInt(); // Getting Nth Input 
        }
        if(LastElement%10==0)
        {
            // Checking Nth Input Is Divisible by 10 Instead Of Checking All
            // If Divisible By 10 Print "Yes"
            System.out.println("Yes");
        }
        else
        {
            // Not Divisible By 10 Print "No"
            System.out.println("No");
        }
    }
    
}
