import java.util.Scanner;

public class DontTrytoCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            int step = 0;
            int temp = 0;
            for (int i = 0; i < 6; i++) {
                if (x.contains(s)) {
                    temp = 1;
                    break;
                }
                x += x;
                step++;
            }
            System.out.println(temp == 1 ? step : -1);
        }
        sc.close();
    }
}