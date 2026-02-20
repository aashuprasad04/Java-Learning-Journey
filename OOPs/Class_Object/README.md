# Class & Object
## 1. Class
A class is a blueprint or template for creating objects.
It defines properties(fields) and behaviors(methods).
### Syntax
```java 
class ClassName {
    // Fields (variables)
    // Methods (functions)
}
```

## 2. Object
An object is an instance of a class.
Each object has its own copy of fields defined in the class.

### Syntax
```java
ClassName obj = new ClassName();
```
### Class & Object Example :
```java
class A {
    void displayClassA() {
        System.out.println("A");
    }
}

public class ClassAndObject {
    public static void main(String[] args) {

        A a = new A();
        a.displayClassA();

    }
}
```
### Output : 
```
A
```
