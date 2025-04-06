package DAY_3;
public class QueDynamic extends Quee{
    @Override
    public void Enquee(int data) throws Exception{
        if (isFull()) {
            int newarr[] = new int[2 * arr.length];
            for (int i = 0; i < arr.length; i++) {
                newarr[i] = arr[i];
            }
            arr = newarr;
        }
        super.Enquee(data);
    }
    public static void main(String[] args) throws Exception {
        QueDynamic q = new QueDynamic();
        q.Enquee(10);
        q.Enquee(20);
        q.Enquee(30);
        q.Enquee(40);
        q.Enquee(50);
        q.Enquee(60);
        q.display();
    }
}
        
