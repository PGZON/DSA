package DAY_5;

public class FindTheFirstAndLastPosition {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 3, 3, 3, 4};
        int ans[] = searchRange(arr, 3);

        System.out.println("First and Last Position: [" + ans[0] + ", " + ans[1] + "]");
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = startIndex(nums, target);
        int end = endIndex(nums, target);
        return new int[]{start, end};
    }

    public static int startIndex(int[] nums, int target) {
        int i = 0, j = nums.length - 1, ans = -1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] == target) {
                ans = m;
                j = m - 1; 
            } else if (target > nums[m]) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return ans;
    }

    public static int endIndex(int[] nums, int target) {
        int i = 0, j = nums.length - 1, ans = -1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] == target) {
                ans = m;
                i = m + 1; 
            } else if (target > nums[m]) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return ans;
    }
}
