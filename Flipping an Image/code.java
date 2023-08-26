class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int m=image.length,n=image[0].length;
        int [][]arr=new int[m][n];
        for(int i=0,k=0;i<m;i++,k++)
        {
            for(int j=n-1,l=0;j>=0;j--,l++)
            {
                arr[k][l]=image[i][j];
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==0)
                {
                    arr[i][j]=1;
                }
                else if(arr[i][j]==1)
                {
                    arr[i][j]=0;
                }
            }
        }
        return arr;
    }
}