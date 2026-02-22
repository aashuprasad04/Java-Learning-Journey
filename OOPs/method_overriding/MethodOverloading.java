class A {
    void display() {
        System.out.println("A");
    }
};

class B extends A {
    @Override
    void display() {
        System.out.println("B");
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
