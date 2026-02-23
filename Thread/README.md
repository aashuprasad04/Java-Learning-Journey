# Thread 
A thread is the smallest unit of execution that can run independently in the JVM.
- Every Java program has a default thread - the main thread
- Threads are part of the same process and share the same memory space.

### Purpose of Threads
- To execute multiple tasks simultaneously.
- To improve CPU utilization.

### main 2 ways to achieve Thread in Java:
1. By extending the Thread class - Extend the Thread class and override the run() method
```java
class MyThread extends Thread {

@Override
public void run(){ ... }
}
```
2. By implementing the Runnable interface - Implement the Runnable interface and define run(), then create a thread using **Thread t = new Thread(obj)**
```java
class MyRunnable implements Runnable {
public void run(){ ... }
}
```
## 2. By extending the Thread class
```java
class A extends Thread {

    String name;

    A(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        String[] s = { "a", "b", "c", "d" };
        for (String ss : s) {
            System.out.println(name + " " + ss);
        }
    }

}

public class Main {
    public static void main(String[] args) {

        A a = new A("Thread-1");
        A a1 = new A("Thread-2");
        a.start();
        a1.start();
    }
}

```
### Output : 
```
Thread-1 a
Thread-2 a
Thread-1 b
Thread-1 c
Thread-1 d
Thread-2 b
Thread-2 c
Thread-2 d

```



## 2. By implementing the Runnable interface 
```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread running via Runnable");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
```
Advantage :
- Avoids java's single inhertance limitation.
- No need to extend Thread - Multiple inheritance is indirectly supported.
