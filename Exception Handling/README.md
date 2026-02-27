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
#### Output : 
```
Error => java.lang.ArithmeticException: / by zero
Cannot divide by zero

```
- Program will not crash.


#### Main Keywords Used
1. try : Code that may cause exception
2. catch : Handles the exception
3. finally : Always executes (optional)
4. throw : Used to throw exception manually
5. throws : Declares exception 

#### Why used :
- Prevents progrm termination due to errors
- Handles unexpected situation safely
- Maintains normal program flow
- Helps in debugging



### Throwable hierarchy
```text
java.lang.Object
└── java.lang.Throwable
    ├── java.lang.Error
    │   ├── java.lang.VirtualMachineError
    │   │   ├── java.lang.OutOfMemoryError
    │   │   └── java.lang.StackOverflowError
    │   └── java.lang.LinkageError
    │       ├── java.lang.ClassFormatError
    │       └── java.lang.NoClassDefFoundError
    └── java.lang.Exception
        ├── java.lang.RuntimeException
        │   ├── java.lang.ArithmeticException
        │   ├── java.lang.NullPointerException
        │   ├── java.lang.IndexOutOfBoundsException
        │   └── java.lang.IllegalArgumentException
        ├── java.io.IOException
        │   ├── java.io.FileNotFoundException
        │   └── java.io.EOFException
        ├── java.sql.SQLException
        ├── java.lang.reflect.InvocationTargetException
        ├── java.net.SocketException
        └── java.net.UnknownHostException

```


## 1.	try-catch: 
Used to handle runtime errors (exceptions) so that the program does not crash and continues running normally.

#### Basic Syntax: 
```java
try {
    // code that may cause exception
}
catch(ExceptionType e) {
    // code to handle exception
}
```
- e is a reference variable that stores the exception object and is used to access error information.
  
#### How it works:
- Code inside try block executes.
- If an error occurs - java creates an exception object.
- Control immediately jumps to the catch block.
- Catch block handles the error.
- Program continues execution after catch.


