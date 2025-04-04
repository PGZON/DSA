package DAY_3;
public class StackClient {
    public static void main(String[] args) throws Exception {
        Stackk s = new Stackk();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display(); 

        System.out.println(" " + s.peek()); 
        System.out.println(" " + s.pop());   
        s.display(); 
    }
}
