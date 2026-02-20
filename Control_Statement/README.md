# Control Statements in Java

## 📚 Topics Covered
1. if / if-else
2. switch
3. for loop
4. while loop
5. do-while loop
6. break / continue
7. Nested loops

## Description
Control statements are used to control the flow of program execution in a Java program.

## Programs Included
- Switch.java
- Break.java
- Continue.java

---

## 6.1 BREAK Statement

The **break statement** is used to immediately terminate a loop or a switch statement and transfer program control to the next statement following it.

It stops the execution instantly when the specified condition is met.

### Usage
- Used inside loops (for, while, do-while)
- Used in switch statements to prevent fall-through

### Example
```java
public class Break {
    public static void main(String[] args){

        // break statement used in loop
        for(int i=0; i<=5; i++){
            System.out.println(i);
            if(i==3){
                break;
            }
        }

        // break statement used in switch case
        int i=1;
        switch(i){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
        }

    }
}
```

## 6.2 CONTINUE Statement
The **continue** statement in java is used to skip the current iteration of a loop and move directly to the next iteration.

### Usage
- To skip specific values in a loop
- To control loop flow using conditions

## 7 Nested loops
A nested loop means a loop inside another loop.
- one loop runs completely inside another loop.

### usage
- pattern printing 
- Matrix operation
- Comparing elements

### Syntax
```java
outer_loop {
    inner_loop {
        // statements
    }
}
```
### Example
```java
public class NestedLoops {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + i);
            for (int j = 1; j <= 5; j++) {
                System.out.println("Check " + j);
            }
        }

    }
}


```
