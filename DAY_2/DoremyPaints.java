//CF 1891/A

import java.util.Scanner;

public class DoremyPaints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t --> 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int first =0;
            int second =0;
            int fc =0;
            int scnt =0;
            int third =0;
            for (int i = 0; i < arr.length; i++) {
                if(first==0|| first==arr[i]){
                    first = arr[i];
                    fc++;
                }
                else if(second==0||second==arr[i]){
                    second=arr[i];
                    scnt++;
                }
                else {
                    third = 1;
                    break;
                }
            }
            if(third==1){
                System.out.println("No");
            }
            else if(second==0){
                System.out.println("Yes");
            }
            else if(n%2==0 && Math.abs(fc-scnt)==0){
                System.out.println("Yes");

            }
            else if(n%2==1 && Math.abs(fc-scnt)==1){
                System.out.println("Yes");

            }
            else {
                System.out.println("Yes");

            }
            
        }
        sc.close();
    }
}
/*import java.util.Scanner;

public class cf1890A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            boolean goodArray = true;

            int n = sc.nextInt();
            int a = 0, b = 0, cntA = 0, cntB = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (a == 0 || x == a) {
                    a = x;
                    cntA++;
                } else if (b == 0 || x == b) {
                    b = x;
                    cntB++;
                } else
                    goodArray = false;
            }

            if (cntA != cntB && cntA + 1 != cntB && cntA != cntB + 1 && cntA != 0 && cntB != 0) 
                goodArray = false;

            System.out.println(goodArray ? "Yes" : "No");
        }
        sc.close();
    }
} */