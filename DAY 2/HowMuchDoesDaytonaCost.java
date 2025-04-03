import java.util.Scanner;

public class HowMuchDoesDaytonaCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            boolean check = false;
            int n = sc.nextInt();
            int k = sc.nextInt();

            for (int i = 0; i < n; i++) {
                if (k == sc.nextInt()) {
                    check = true;
                    break;
                }
            }
            System.out.println(check?"Yes":"No");
        }
        sc.close();
    }
}