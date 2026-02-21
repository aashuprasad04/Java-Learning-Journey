class PC {
    int age;
    String name;

    PC(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void display() {
        System.out.println("Age : " + age + "\n" + "Name : " + name);
    }
}

public class ParameterizedCons {
    public static void main(String[] args) {

        PC p = new PC(20, "Azy");
        p.display();

    }
}
