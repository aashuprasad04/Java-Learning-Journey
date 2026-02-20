# Constructor
A Constructor is a special type of method in java that is used to initialize object of a class.
- **Its name must be the same as the class name**.
- It is called automatically when an object of the class is created.
- it does not have a return type, not even ***void***.

```java
ClassName() {
    // code
}
```

### Types of Constructors
1. ***Default Constructor***          :  No parameters
2. ***Parameterized Constructor***    :  With parameters
3. ***Copy Constructor***             :  Takes another object of the same class

## 1. Default Constructor
A default constructor is a constructor provided automatically by Java if the programmer does not write any constructor in the class.
- Automatically provided by Java only if no constructor is defined.

```java
class DC {
    DC() {
        System.out.println("Default Constructor");
    }
}

public class DefaultCons {
    public static void main(String[] args) {

        DC d = new DC();

    }
}
```

### Output : 
```
Default Constructor
```

