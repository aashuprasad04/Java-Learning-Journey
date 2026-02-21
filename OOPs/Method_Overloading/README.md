# Method overloading
Method Overloading is a feature in Java that allows a class to have **more than one method with the same name** but **different parameter** lists (different type, number, or both). It is a type of **compile-time polymorphism**.

Same method name, but different parameters. Return type can be same or different, but overloading depends on parameters, not return type.

## Types of Method Overloading : 
- By changing the number of parameters
- By changing the data type of parameters
- By changing the sequence of parameters

### 1.  By changing the number of parameters

```java
class A {

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

        A a = new A();
        int m = a.sum(1, 2);
        System.out.println(m);

        int n = a.sum(1, 2, 3);
        System.out.println(n);
    }
}

```

### Output : 
```
3
6
```


### 2.  By changing the data type of parameters
```java
class MV02 {

    int sum(int a, int b) {
        return a + b;

    };

    double sum(double a, double b) {
        return a + b;
    };

}

public class MethodOverloading02 {
    public static void main(String[] args) {

        MV02 m = new MV02();
        System.out.println(m.sum(5, 5));
        System.out.println(m.sum(5.5, 5.5));
    }
}

```
### Output : 
```
10
11.0
```
