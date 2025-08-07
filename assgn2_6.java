public class assgn2_6 {
    public String name = "Akash";
    private int rollNo = 101;
    protected double marks = 89.5;

    public void showDetails() {
        System.out.println("Inside Student class:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

class Test extends Student {
    public static void main(String[] args) {
        Test s = new Test();

        System.out.println("Accessing public and protected members of Student.");
        System.out.println("Name: " + s.name);
        // System.out.println("Roll No: " + s.rollNo);  // Not accessible
        System.out.println("Marks: " + s.marks);       // Accessible via inheritance
    }
}
