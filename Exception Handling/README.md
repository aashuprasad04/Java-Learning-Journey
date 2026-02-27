1.	try-catch
2. 	finally
3.	throw
4.	throws
5.	Checked vs Unchecked
6.	Custom exception


Exception Handling is a mechanism in programming used to handle runtime errors.
<br>So that the program does not crash and continues execution noramlly.
<br>When an error occurs during program execution, exception handling helps manage it safely.

#### 1.  Example (Without Exception Handling)
```java
int a = 10;
int b = 0;
System.out.println(a / b);   // Error → program stops
```
#### Output : 
```text
Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Exception01.main(Exception01.java:6)

Process finished with exit code 1

```
- This gives ArithmeticException and program terminates.

#### 2. With Exception Handling
```java

        int a = 10;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Error => "  + e);
            System.out.println("Cannot divide by zero");
        }
```
### Output : 
```
Error => java.lang.ArithmeticException: / by zero
Cannot divide by zero

```



