package DAY_3;

public class Stackk {

    protected int[] arr;
    private int top;

    public Stackk() {
        arr = new int[5];
        top = 0;
    }

    public Stackk(int size) {
        arr = new int[size];
        top = 0;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isfull() {
        return top == arr.length;
    }

    public void push(int ele) throws Exception {
        if (isfull()) {
            throw new Exception("Stackk is full");
        }
        arr[top] = ele;
        top++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stackk is empty");
        }
        top--;
        return arr[top];
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stackk is empty");
        }
        return arr[top - 1];
    }

    public int size() {
        return top;
    }

    public void display() {
        for (int i = 0; i < top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
