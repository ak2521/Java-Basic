
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc =new Scanner(System.in);
        int length = sc.nextInt();
        int noOfPhotos = sc.nextInt();
        int[] width =new int[noOfPhotos];
        int[] height =new int[noOfPhotos];
        for(int i=0;i<noOfPhotos;i++)
        {
            width[i] = sc.nextInt();
            height[i] = sc.nextInt();
        }
        for(int i=0;i<noOfPhotos;i++)
        {
            if(length>width[i] || length>height[i])
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else
            {
                if(width[i]==height[i])
                {
                    System.out.println("ACCEPTED");
                }
                else if(width[i]>height[i]||width[i]<height[i])
                {
                    System.out.println("CROP IT");
                }

            }
        }
    }
}

