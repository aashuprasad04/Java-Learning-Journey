# Inheritance
Inheritance is one of the main concepts of OOP (Object-Oriented Programming). <br>
Inheritance means: One class acquires properties and behaviors (variables + methods) of another class. <br>
Inheritance represent IS-A relationship.
- Parent Class -> Superclass/ Base Class
- Child Class -> Subclass/ Derived Class

### Basic Syntax :
```java
class Parent {
    // properties + methods
}

class Child extends Parent {		
    // inherits Parent class
}
```
### Simple Example : 
```java
class BE01 {
    void display() {
        System.out.println("Basic Example Class 01");
    }
}

class BE02 extends BE01 {}

public class BasicExample {
    public static void main(String[] args) {
        BE02 b = new BE02();
        b.display();
    }
}

```
### Output : 
```
Basic Example Class 01
```

## Types of Inheritance
1. Single Inheritance
2. Multilevel Inhertance
3. Hierarchical Inheritance
4. Multiple Inheritance
5. Hybrid Inheritance

### 1. Single Inheritance :
### 4. Multiple Inheritance :
A class inherits properties and methods form more than one parent class. <br>
#### Ex. Java does not support Multiple Inheritance using classes.
- Multiple Inheritance using classes not allowed.
- If both Class A and Class B have the same method, Class C gets confused and Ambiguity occurs.
```java
class A{};
class B{};
class C extends A,B{} 	// Not Allowed
```


