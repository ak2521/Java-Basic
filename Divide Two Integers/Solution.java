import java.lang.Math;
class Solution {
    public int divide(int di, int dr) {
        int x=di/dr;
        if (di == -2147483648 && dr == -1)
        {
            return (2147483647);
        }
        else if(di<0 && dr<0)
        {   
            return Math.abs(x);
        }
        
        return x;
    }
}
