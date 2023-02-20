import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int t = sc.nextInt();
        int n1 = sc.nextInt();
        int m;
        float in;
        float tot = 0;
        // for bank 1
        for (int i = 0; i < n1; ++i) {
            m = sc.nextInt();
            in = sc.nextFloat();
            tot += p * (in / 1 - (1 / Math.pow((1 + in), m * 12))) * m;
        }
        int n2 = sc.nextInt();
        float tot2 = 0;
        // for bank 2
        for (int i = 0; i < n2; ++i) {
            m = sc.nextInt();
            in = sc.nextFloat();
            tot2 += p * (in / 1 - (1 / Math.pow((1 + in), t * 12))) * m;
        }
        if (tot2 <= tot)
            System.out.println("Bank B");
        else
            System.out.println("Bank A");
        sc.close();
    }
}