public class Combine {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 9 };
        int arr2[] = { 5, 6, 7, 8, 10 };

        int ans[] = mergeArrays(arr, arr2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] mergeArrays(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;

        int ans[] = new int[n + m];

        int i = 0, j = 0, idx = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                ans[idx] = arr1[i];
                i++;
            } else {
                ans[idx] = arr2[j];
                j++;
            }
            idx++;
        }
        while (i < n) {
            ans[idx] = arr1[i];
            i++;
            idx++;
        }
        while (j < m) {
            ans[idx] = arr2[j];
            j++;
            idx++;
        }

        return ans;
    }
}  