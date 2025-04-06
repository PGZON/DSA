//CF1873C

import java.util.Scanner;

public class TargetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int score = 0;
            for (int i = 0; i < 10; i++) {
                String a = sc.next();
                int temp = Math.min(i, 9 - i);
                for (int j = 0; j < a.length(); j++) {
                    if (a.charAt(j) == 'X') {
                        int tempp = Math.min(j, 9 - j);
                        score += Math.min(temp, tempp)+1;
                    }
                }

            }
            System.out.println(score);

        }
    }
}
