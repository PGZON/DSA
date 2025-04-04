package DAY_3;

public class Record_Ex {

    public record Student(String name, int age) {
    }

    public static void main(String[] args) {
        Student s1 = new Student("PG", 20);
        Student s2 = new Student("PGG", 200);

        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s2.age);
        System.out.println(s2.name);

    }

}
