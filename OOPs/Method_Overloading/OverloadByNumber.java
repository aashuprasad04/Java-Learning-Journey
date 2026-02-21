class A {

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

public class OverloadByNumber {
    public static void main(String[] args) {

        A a = new A();
        int m = a.sum(1, 2);
        System.out.println(m);

        int n = a.sum(1, 2, 3);
        System.out.println(n);
    }
}

