1.	Thread class
2. Runnable interface
3.	thread lifecycle
4.	Synchronization
5.	wati(), notify()
6.	Deadlock
7.	Thread pool

A program always has one thread.<br>
This thread starts at the beginning of main().

# Threads
A Thread is a lightweight subprocess - a small unit of execution inside a program. <br>
A program can have multiple threads running simultaneously. 

```text
Process (Chrome)
   ├── Tab 1 Thread
   ├── Tab 2 Thread
   └── Download Thread
```
# Multithreading
Multithreading is the ability of a program to execute multiple threads concurrently. <br>
Multiple tasks run within a single process. 

# Creating Thread in java
#### Method 1: Extending Thread class
```java
public class A extends Thread {

    String name;

    A(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println(name);
        }

    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A("Thread 01");
        A a2 = new A("Thread 02");

        a.start();
        a2.start();
    }
}
```

#### Method 2: Implement Runnable Interface (Best way)
```java
public class B implements Runnable {

    String name;

    B(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(name);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        B b = new B("Thread01");
        B b1 = new B("Thread02");

        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b1);

        t1.start();
        t2.start();

    }
}

```

## 3.	thread lifecycle




## Important Thread Methods
1. start(); <br>
   starts a new thread.
   - Creates a new execution path.
   - Internally calls run() method.
   - Never call run() directly.
     

2. run(); <br>
   Contains the coad executed by the thread.
   
3. sleep(milliseconds); <br>
   Pause the thread for a specific time.
   - used for dely
   - throws InterruptedException
     ```java
        A a = new A("Thread01");
        A a1 = new A("Thraed02");

        a.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
        a1.start();
     ```
     ```text
      Thread01
      Thread01
      Thread01
      Thread01
      Thread01
      Thread01
      Thread01
      Thread01
      Thread01
      Thread01
      Thread01
      Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
      Thraed02
      Thraed02
      Thraed02
      Thraed02
      Thraed02
      Thraed02
      Thraed02
      Thraed02
      Thraed02
      Thraed02
      Thraed02
     ```

