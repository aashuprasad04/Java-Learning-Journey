# Strings
1.	String class
2. 	String methods
3.	StringBuffer
4.	StringBuilder
5.	Immutable vs Mutable
6.	String Comparison


## 1.  String class
A String is a sequence of character used to store text data like names, messages, or sentences. <br>
String is not a primitive data type. It is a class represent in the : 
```java
java.lang.package
```
- String are mutable (cannot be change after creation).
- Stored in **String Constant Pool** (SCP) for memory optimization.

#### Example : 
```java
String s = "hello";
String ss = s.concat(" World");
        
System.out.println("s ->  " + s);
System.out.println("ss ->  " + ss);	
```
#### Output : 
```
s ->  hello
ss ->  hello World
```
- String create a new object instead of modyfing the old one.

### Java mainly has 2 way to create Strings : 
#### 1. String Literal => Use String Constant Pool (SCP) memory (Special memory area inside heap)
  ```java
String s1 = “Java”;
String s2 = “Java”;
```
```text
String Pool
“Java”
^     ^
|     |
s1   s2
```
- Both variables refer to same memory location.
- If a string already exists in SCP, Java does not create a new object, it reuses the existing one.

#### 2. String Object (Using new keyword) => Use heap memory
```java
String s1 = new String(“Java”);
String s2 = new String(“Java”);
```
```text
Heap memory
s1 → “Java”
s2 → “Java”

```
- Seprate objects are created in Heap memory.
- Creates a new object in heap memory, even if the same value exists in SCP. 
<br><br>

## 2.  String methods
Java String class provides many built-in methods to manipulate and handle text,<br>
String are immutable, so most methods return a new string instead of changing the original.
1. length()
   <br>return the number of charater string.
```java
String s = "Hello";
int a = s.length();
System.out.println(a);  // Output: 5
```
2. chatAt(int index)
   <br> Returns the character at the given index.
```java
String s = "Hello";
char a = s.charAt(0);
System.out.println(a);  // Output: H
```
3. concat(String str)
   <br> Concatenates (joins) two strings.
```java
String s = "Hello";
String a = s.concat(" World");
System.out.println(s);  // Output: Hello
System.out.println(a);  // Output: Hello World   
```
4. equals(object obj)
   <br> Compare two strings based on content.
```java
String s = "Hello";
String ss = "hello";
boolean a = s.equals(ss);
System.out.println(a);  // Output: false
```
5. equalsIgnoreCase(object obj)
   <br> Compare two strings ignoring case.
```java
String s = "Hello";
String ss = "hello";
boolean a = s.equalsIgnoreCase(ss);
System.out.println(a); // Output: true
```
6. toUpperCase()
   <br> Converts string to uppercase.
```java
String s = "Hello";
String ss = s.toUpperCase();
System.out.println(ss); // Output: HELLO
```


















