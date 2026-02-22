class AA {
    void display() {
        System.out.println("A");
    }
}

class BB extends AA {
    @Override
    void display() {
        System.out.println("B");
    }
}

public class RunTimePoly {
    public static void main(String[] args) {

        AA aa = new BB();
        aa.display();

    }
}
