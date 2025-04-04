package DAY_3;
// package DAY_3;

// import Stackk;

public class StackDyanamic extends Stackk {

    @Override
    public void push(int ele) throws Exception {
        if (isfull()) {
            int newarr[] = new int[2 * arr.length];
            for (int i = 0; i < arr.length; i++) {
                newarr[i] = arr[i];
            }
            arr = newarr;
        }
        super.push(ele);
    }

    public static void main(String[] args) throws Exception {

        StackDyanamic s = new StackDyanamic();
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(11);
        s.push(10);
        s.push(12);
        s.display();

    }
}
