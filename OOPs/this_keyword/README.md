# this keyword
this keyword is a reference variable that refers to the current object. <br>
this = current object 

### Difference between ***this*** and ***object reference***
object reference means : Class c = new Class();
- c : reference **outside** class
- this : reference **inside** class

## Several way to use this keyword in java. Mention a few way
- Refer current obj instance Variables
- Call Current Class Method
- Call Current Class Constructor
- Pass Current Object as Argument
- Return Current Objects

### 1.  Refer current obj instance Variables
When class variables (instance variables) and constructor/method parameters have the same name, we use this to refer to the current object variables.
```java
class TRV {

    int a;
    int b;

    TRV(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("a = " + a + "\n" + "b = " + b);
    }

}

public class This_ReferVariables {
    public static void main(String[] args) {
        TRV t = new TRV(5, 10);
        t.display();
    }
}

```
### Output : 
```
a = 5
b = 10
```

### 2.  Call Current Class Method using this
```java
class TCV {

    void method01() {
        System.out.println("Method 1");
    }

    void method02() {
        this.method01();
    }
}

public class This_callMethod {
    public static void main(String[] args) {
        TCV t = new TCV();
        t.method01();

    }
}

```
### Output : 
```
Method 1
```
### 3.  Call Current Class Constructor
this() is used to call another constructor of the same class.
this process is called constructor chaining.
- Calls constructor of same class.
- used only inside constructor.
- Must be first statement
#### Correct :
```java
Class(){
  this();
}
```
#### Wrong :
```java
Class(){
  System.out.println("hi");
  this();
}
```
