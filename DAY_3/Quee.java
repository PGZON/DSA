package DAY_3;

public class Quee {
    protected int arr[];
    int front;
    int size;

    public Quee(int cap) {
        arr = new int[cap];
        front = 0;
        size = 0;
    }

    public Quee() {
        arr = new int[5];
        front = 0;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public int size() {
        return size;
    }

    public void Enquee(int element) throws Exception {
        if (isFull())
            throw new Exception("Que is full");
        int idx = (front + size) % arr.length;
        arr[idx] = element;
        size++;
    }

    public int Dequee() throws Exception {
        if (isEmpty())
            throw new Exception("Que is Empty");
        int element = arr[front];
        front = front + 1 % arr.length;
        size--;
        return element;
    }

    public int GetFront() throws Exception {
        if (isEmpty())
            throw new Exception("Que is Emmpty");
        return arr[front];
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % arr.length;
            System.out.println("\t" + arr[idx]);
        }
        System.out.println();
    }
}
