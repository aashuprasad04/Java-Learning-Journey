class CopyCons01 {

    int age;
    String name;

    CopyCons01(int age, String name) { // 02. Parameterized Constructor
        this.age = age;
        this.name = name;
    }

    CopyCons01(CopyCons01 c) { // 03 Copy Constructor
        age = c.age;
        name = c.name;
    }

    void display() {
        System.out.println("Age : " + age + "\n" + "Name : " + name);
    }
}

public class CopyCons {
    public static void main(String[] args) {

        CopyCons01 c1 = new CopyCons01(20, "Aashu");
        CopyCons01 c2 = new CopyCons01(c1);
        c2.display();

    }
}
