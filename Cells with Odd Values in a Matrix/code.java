class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=0;
            }
        }
        int h=indices.length;
        for(int i=0;i<h;i++)
        {
                int x=indices[i][0];
                int y=indices[i][1];
                for(int k=0;k<n;k++)
                {
                    arr[x][k]+=1;
                }
                for(int k=0;k<m;k++)
                {
                    arr[k][y]+=1;
                }
        }
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                //System.out.println(arr[i][j]+" ");
                if(arr[i][j]%2==1)
                {
                    count++;
                }
            }
            //System.out.println("");
        }
        return count;
    }
}