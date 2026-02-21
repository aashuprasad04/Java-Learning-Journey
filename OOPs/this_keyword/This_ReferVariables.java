class TRV {

    int a;
    int b;

    TRV(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("a = " + a + "\n" + "b = " + b);
    }

}

public class This_ReferVariables {
    public static void main(String[] args) {
        TRV t = new TRV(5, 10);
        t.display();
    }
}
