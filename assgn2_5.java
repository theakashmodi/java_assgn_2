interface Message {
    void show();
}

class Outer {
    class Inner {
        void display() {
            System.out.println("This is inner class.");
        }
    }

    void accessInner() {
        Inner in = new Inner();
        in.display();
    }

    void anonymousDemo() {
        Message msg = new Message() {
            public void show() {
                System.out.println("This is anonymous class.");
            }
        };
        msg.show();
    }
}

public class assgn2_5 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.accessInner();
        outer.anonymousDemo();
    }
}
