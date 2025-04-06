//leetcode 901
import java.util.Stack;

public class OnlineStockSpan {
     Stack<int[]> st = new Stack<>();
    public int next(int price) {
        int day=1;
        while(!st.isEmpty() && price>=st.peek()[0]){
            day = day+st.pop()[1];
        }
        st.push(new int[]{price,day});
        return day;
    }
}
