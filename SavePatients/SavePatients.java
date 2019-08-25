package SavePatients;
import java.util.Scanner;
public class SavePatients {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int flag = 0;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > b[i]) {
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
