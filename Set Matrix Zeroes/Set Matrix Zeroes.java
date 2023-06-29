class Solution {
    public void setZeroes(int[][] matrix) {
       
       int arr[][] = new int [matrix.length][matrix[0].length];

    
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
                arr[i][j] = matrix[i][j];
        }


        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==0)
                {
                    for(int k=0;k<arr.length;k++)
                        matrix[k][j]=0;
                    for(int k=0;k<arr[0].length;k++)
                        matrix[i][k]=0;
                }
            }
        }
    }
}