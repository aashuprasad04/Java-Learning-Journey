# Method Overriding  @Override
Method Overriding means re-defining the parent class method in the child class with new behavior.<br>
Achieve runtime polymorphism.
- Same method
- Same Parameters
- New implementation

  
### Example : 
```java
Parent → show()  // old definition
Child  → show()  // redefined (overridden)
```

### Rules :
- Method name must be same
- parameters must be same
- Return type must be same
- Must be inheritance relationship
- Static method cannot be overridden

### Basic Syntacx : 
```java
class Parent {
    void show() {
        // parent method
    }
}

class Child extends Parent {
    @Override
    void show() {
        // overridden method
    }
}
```
### Example : 
```java
class A {
    void display() {
        System.out.println("A");
    }
};

class B extends A {
    @Override
    void display() {
        System.out.println("B");
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
```
### Output : 
```
B
```
### Call parent Method using super() : 
```java
class A {
    void display() {
        System.out.println("A");
    }
};

class B extends A {
    @Override
    void display() {
        super.display();    // call parent class method
        System.out.println("B");
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
```
### Output : 
```
A
B
```


