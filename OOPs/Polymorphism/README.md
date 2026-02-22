# Polymorphism
Polymorphism means "many forms". <br>
Polymorphism allows one object or method to behave differently in different situation.
- Same method name -> different behavior.

#### Properties
- method name remains same
- Behavoir changes based on : 1. parameters or 2. object type
- Occurs in two ways : 1. Compile time 2. Runtime
- uses overloading and overriding

#### Types of Polymorphism
1. Compile Time Polymorphism (Static Polymrophism) : Achieved using Method Overloading
2. Runtime Polymorphism (Dynamic Polymorphism) : Achieved using Method @Overriding


## 2. Runtime Polymorphism
```java
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

```
### Output : 
```
B
```
