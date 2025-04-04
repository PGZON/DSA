//CF 1877A

package DAY_3;

import java.util.Scanner;

public class GoalsofVictory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t --> 0) {
            int n = sc.nextInt();
            // int x = sc.nextInt();
            int count = 0;
            for (int i = 0; i < n-1; i++) {
                count+=sc.nextInt();
            }
            System.out.println(0-count);
        }
        sc.close();
    }
}