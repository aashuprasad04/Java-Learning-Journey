class MV02 {

    int sum(int a, int b) {
        return a + b;

    };

    double sum(double a, double b) {
        return a + b;
    };

}

public class OverloadByType {
    public static void main(String[] args) {

        MV02 m = new MV02();
        System.out.println(m.sum(5, 5));
        System.out.println(m.sum(5.5, 5.5));
    }
}
