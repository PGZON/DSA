public class MergeSort {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 9 };

        int ans[] = mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }

    public static int[] mergeSort(int arr[], int i, int j) {
        if (i == j) {
            int[] a = new int[1];
            a[0] = arr[i];
            return a;
        }

        int mid = (i + j) / 2;

        int[] a = mergeSort(arr, i, mid);
        int[] b = mergeSort(arr, mid + 1, j);

        return mergeArrays(a, b);
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