import java.util.Stack;

public class StackRevrse {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
    }
    public static void rev(Stack<Integer>st){
        if(st.isEmpty())return;
        int ele = st.pop();
        rev(st);
        insert(st,ele);
    }
    public static void insert(Stack <Integer>st,int i){
        if(st.isEmpty()){
            st.push(i);
            return;
        }
        int ele = st.pop();
        insert(st, i);
        st.push(ele);
    }

}