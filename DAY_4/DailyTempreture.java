//leetcode 739
public class DailyTempreture {
    public static void main(String[] args) {
        int temp[] = { 73, 74, 75, 71, 69, 72, 76, 73 };
        int result[] = DailyTempreturee(temp);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    public static int[] DailyTempreturee(int temp[]){
       int n = temp.length;
       int result[] = new int[n];
       for (int i = 0; i < n; i++) {
        for (int j = i+1; j < n; j++) {
            if(temp[i]<temp[j]){
                result[i] = j-i;
                break;
            }
            
        }
       }
       return result;
    }
}
