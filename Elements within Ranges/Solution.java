import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Create scanner
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int arr[] = new int[n];
        // get array
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        // get ranges
        int ranges[][] = new int[r][2];
        for (int i = 0; i < r; ++i) {
            ranges[i][0] = sc.nextInt();
            ranges[i][1] = sc.nextInt();
        }
        int count = 0;
        // find count of elements within the range
        for (int i = 0; i < r; ++i, count = 0) {
            for (int j = 0; j < n; ++j) {
                if (arr[j] > ranges[i][0] && arr[j] < ranges[i][1])
                    ++count;
            }
            System.out.print(count + " ");
        }
        sc.close();
    }
}