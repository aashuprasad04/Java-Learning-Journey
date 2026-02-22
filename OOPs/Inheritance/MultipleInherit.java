interface MI01 {
    void abstractMethodA();     // abstract method

    default void defaultMethodB() {     // default method
        System.out.println("Default Method");
    }
}

interface MI02 {
    void abstractMethodC();
}

class MI03 implements MI01, MI02 {
    public void abstractMethodA() {
        System.out.println("Abstract Method A");

    }

    public void abstractMethodC() {
        System.out.println("Abstract Method C");
    }

    void displaySuperClassMethod() {
        MI01.super.defaultMethodB();    // super()
    }

}

public class MultipleInherit {
    public static void main(String[] args) {

        MI03 m = new MI03();
        m.abstractMethodA();
        m.abstractMethodC();
        m.displaySuperClassMethod();

    }
}
