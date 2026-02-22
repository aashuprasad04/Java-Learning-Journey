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
Java does not support Multiple Inheritance using classes.
- Multiple Inheritance using classes not allowed.
- If both Class A and Class B have the same method, Class C gets confused and Ambiguity occurs.
#### Ex. 
```java
class A{};
class B{};
class C extends A,B{} 	// Not Allowed
```
#### Multiple inheritance is supported through interface. 
#### (a)    Interface 
An interface is a blueprint of a class that contains:
- abstract method
- default method
- static method
- constatns
Interface tells What to do, not How to do.
#### Interface Syntax : 
```java
interface interfaceName{
void display();    // abstract method
}
```
#### (b)    Abstract method
A method without body is called abstract method.
```java
void abstractMethod();    // No {}
```
#### (c)    Default Method : 
A methhod with body inside interface using default keyword.
When an abstract method is declared, it must be implemented.
```java
default void show() {
System.out.println("Default method");
}
```

#### (d)    super() keyword
calls parent class method. 
##### Normally
```java
super.method():
```


#### (e)    super() in interface case : 
ONLY used for default methods of interface. <br>
We specify interface name
```java
InterfaceName.super.method();
```
### Multiple inhertance using interface Syntax : 
```java
interface A{};
interface B{};
class c implements A,B ();
```


### Multiple inheritance using interface 
```java
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

```
### Output : 
```
Abstract Method A
Abstract Method C
Default Method
```
