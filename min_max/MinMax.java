package min_max;
import java.util.Arrays;
import java.util.Scanner;
public class MinMax {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        long minSum = 0,maxSum = 0;
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0;i<n-1;i++){
            minSum +=arr[i];
            maxSum +=arr[(n-1)-i];
        }
        System.out.println(minSum + " "+ maxSum);
    }
}
