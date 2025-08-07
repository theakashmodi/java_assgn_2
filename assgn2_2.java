interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Student implements Printable, Showable {
    String name = "Akash";
    int roll = 101;
    double marks = 89.5;

    public void print() {
        System.out.println("Printing Student Details...");
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
    }

    public void show() {
        System.out.println("Showing Student Information.");
    }
}

public class assgn2_2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.print();
        s.show();
    }
}
