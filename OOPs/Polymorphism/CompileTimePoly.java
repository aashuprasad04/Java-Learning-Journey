class A {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
};

public class CompileTimePoly {
    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.add(5, 5));
        System.out.println(a.add(5, 5, 5));
    }
}
