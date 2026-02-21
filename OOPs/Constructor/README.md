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
## 2. Parameterized Constructor
That accepts arguments(parameters) to initialize an object with spedific values when it is created.
- It takes input parameters.
- It allows you to set custom values for object properties.

```java
class PC {
    int age;
    String name;

    PC(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void display() {
        System.out.println("Age : " + age + "\n" + "Name : " + name);
    }
}

public class ParameterizedCons {
    public static void main(String[] args) {

        PC p = new PC(20, "Azy");
        p.display();

    }
}
```
### Otput : 
```
Age : 20
Name : Azy
```
## 3 Copy Constructor 
That creates a new object by copying the data of an existing object of the same class.
- The parameter of a copy cons. must be the same class type.

```java
class CopyCons01 {

    int age;
    String name;

    CopyCons01(int age, String name) { // 02. Parameterized Constructor
        this.age = age;
        this.name = name;
    }

    CopyCons01(CopyCons01 c) { // 03 Copy Constructor
        age = c.age;
        name = c.name;
    }

    void display() {
        System.out.println("Age : " + age + "\n" + "Name : " + name);
    }
}

public class CopyCons {
    public static void main(String[] args) {

        CopyCons01 c1 = new CopyCons01(20, "Aashu");
        CopyCons01 c2 = new CopyCons01(c1);
        c2.display();

    }
}
```
### Output : 
```
Age : 20
Name : Aashu
```
