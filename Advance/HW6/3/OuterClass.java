package Hw6_3;

public class OuterClass {
    private int x;

    OuterClass(int x) {
        this.x = x;
    }

    class InnerClass {
        void display() {
            System.out.println("Value of x: " + x);
        }
    }
}
