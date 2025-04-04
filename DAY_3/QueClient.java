package DAY_3;

public class QueClient {
    public static void main(String[] args) throws Exception {
        Quee q = new Quee();
        q.Enquee(5);
        q.Enquee(7);
        q.Enquee(9);
        q.display();
        q.Dequee();
        q.Dequee();
        q.display();

    }
}
