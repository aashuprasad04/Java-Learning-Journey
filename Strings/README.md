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

7. toLowerCase()
   <br> Converts string to lowercase.
```java
String s = "Hello";
String ss = s.toLowerCase();
System.out.println(ss); // Output: hello
```

8. trim()
   <br> Removes leading space (space at the beginning) and trolling (space at the end) spaces.
```java
String s = "    ronix        ";
String a = s.trim();
System.out.println(a);        // Output: ronix
```

9. substring(int start)
    <br> Returns substring from start index to end.
```java
String s = "Hello World";
String a = s.substring(6);
System.out.println(a); // Output: World
```

10. substring(int start, int end)
    <br> Returns substring from start index to ***end-1***.
```java
String s = "Hello World";
System.out.println(s.substring(6)); // Output: World
```

11. replace(char oldChar, char newChar)
    <br> Replace all occurences of a chracter.
```java
String s = "Hello World";
String aa = s.replace("o", "a");
String a = s.replace("World", "Java");
System.out.println(aa); // Output: Hella Warld
System.out.println(a); // Output: Hello Java
```
12. replaceAll(String regex, String replacement)
    <br> Replace all occurences of a pattern using regex.
    - regex : regex short for (regular expression) is a pattern used to match, search or manipulate strings.
    - When applied to a string, it helps check whether the string fits a certain pattern.

```java
String s = "1,2,3";
String a = s.replaceAll("\\d", "x");
System.out.println(a);  // Output: x,x,x
```

```text
Symbol	        Meaning
.	        Any single character
*	        Zero or more occurrences of previous element
+	        One or more occurrences of previous element
?	        Zero or one occurrence
^	        Start of string
$	        End of string
[abc]	        Any one character a, b, or c
[a-z]	        Any lowercase letter from a to z
\d	        Any digit (0-9)
\w	        Any word character (letter, digit, underscore)
\s	        Any whitespace (space, tab)
```

13. split(String regex)
    <br> Splits string into an array based on delimiter or reges.
```java
String s = "a,b,c,d";
String[] a = s.split(",");

for (String aa : a) {
  System.out.print(aa + " "); // Output: a b c d 
}
```

14. startsWith(String prefix)
    <br> Checks if string starts with given prefix.
```java
String s = "Hello";
boolean a = s.startsWith("He");
System.out.println(a); // Output: true
```

15. endsWith(String suffix)

16. contains (CharSequence s)
    <br> Checks if string contains another sequence.
```java
String s = "Hello World";
System.out.println(s.contains("World")); // Output: true
```

17. indexOf(String s)
    <br> Returns the first occurrence index of a substring.
```java
        String s = "Hello";
        int a = s.indexOf("H");
        System.out.println(a); // OUtput: 0
```
18. lastIndexOf(String s)
    <br> Returns the last occurrence index of a substring.
```java
        String s = "Helloe";
        int a = s.lastIndexOf("e");
        System.out.println(a);
```

19. isEmpty()
    <br> Checks if string is empty (length = 0).
```java
String s = "";
System.out.println(s.isEmpty()); // Output: true
```

20. valueOf()    ------    [ String.valueOf(int a) ]
    <br> Converts other types (int, char, float, boolean) to string.
```java
int num = 100;
String str = String.valueOf(num);
System.out.println(str); // Output: "100"
```

21. compareTo(String s)
    <br> doubt


<br><br><br><br>
## 3.  String Buffer => mutable | Thread-safe 
- String buffer is a mutable sequence of character.
- Modify the content of string without creating a new object.
  - Belongs to java.lang package.
  - Thread safe (method are synchronized)
  - Can be used for
    - inserting
    - appending
    - deleting
    - reversing character
   - Faster than String when doing many modification.
   - Automatically increase capacity when neede (Dynamic size).
   - Stored in heap.   

#### Syntax: 
```java
StringBuffer sb1 = new StringBuffer();               // empty buffer 
StringBuffer sb2 = new StringBuffer("hello");        
StringBuffer sb3 = new StringBuffer(50);             // Capacity 50 | default capacity 16  
```

#### Means: 
 - StringBuffer store a normal string like String.
 - Internally uses a char array to store characters.
   ```java
        StringBuffer sb = new StringBuffer("hello"); // 'h','e','l','l','o'
   ```
#### Default Capacity:
StringBuffer has a default space of 16 character.
<br> If this is exceeded, it automatically double.

- new capacity = (oldCapacity * 2) + 2

```java
StringBuffer sb1 = new StringBuffer();
System.out.println(sb1.capacity()); // default capacity: 16
System.out.println(sb1.length()); // length: 0

sb1.append("abcdefghijklmnopq"); // a to q => 17 (1 indexing)
System.out.println(sb1.capacity()); // new capacity 34
// capacity formula => new capacity = (oldCapacity * 2) + 2

System.out.println(sb1.length()); // length 17
```

#### Imp Methods
1. append(String s);
   <br> Add string at the end of buffer.
   ```java
           StringBuffer sb1 = new StringBuffer("hello");
           sb1.append("_world");
           System.out.println(sb1); // Outptu: hello_world
   ```
2. insert(int index, String s); 
   <br> Insert String at specific index.
   - Exact with 0 indexing
   ```java
        StringBuffer sb2 = new StringBuffer("hello_world");
        sb2.insert(6, "Java"); // Exact with 0 indexing
        System.out.println(sb2);        // Output : hello_Javaworld        
   ```
3. substring(int start, int end);
   <br> Returns substring
   - from start to end-1.
   ```java
        StringBuffer sb21 = new StringBuffer("Hello");
        System.out.println(sb21.substring(0, 2));        // Output : He
   ```

4. replace(int start, int end, String s);
   <br> Replace character
   - from start to end-1
     ```java
        StringBuffer sb3 = new StringBuffer("Hello_world");
        sb3.replace(0, 5, "Hi"); 
        System.out.println(sb3);        // Output : Hi_world
     ```

5. delete(int start, int end);
   <br> Delete character
   - from start to end-1
    ```java
        StringBuffer s4 = new StringBuffer("Hello_world");
        s4.delete(0, 2);
        System.out.println(s4);        // Output : llo_world
    ```

6. reverse()
   <br> Reverse the whole buffer.
   ```java
        StringBuffer s6 = new StringBuffer("Hello");
        s6.reverse();
        System.out.println(s6);        // Output : olleH
   ```

7. charAt(int index);
   <br> Return character at given index.
   - Exact with 0 indexing.
   ```java
        StringBuffer s7 = new StringBuffer("Azy");
        System.out.println(s7.charAt(0));        // Output : A
   ```

8. setCharAt(int index, char ch);
   <br> Replace character at given index
   ```java
        StringBuffer s8 = new StringBuffer("Azy");
        s8.setCharAt(0, 'R');
        System.out.println(s8);        // Output : Rzy
   ```



9. length()
10. capacity()

11. ensureCapacity(int minCapacity);
    <br> Ensure minimum capacity.
    ```java
        StringBuffer s9 = new StringBuffer();
        System.out.println(s9.capacity());        // Output : 16
        s9.ensureCapacity(100);
        System.out.println(s9.capacity());        // Output : 100
    ```


12. indexOf(String s); | lastIndexOf(String st);
    - indexOf : Returns first index of substring.
    - lastIndexOf : Returns last index of substring.
   
    ```java
        StringBuffer sb10 = new StringBuffer("Hello_World");
        System.out.println(sb10.indexOf("l"));         // Output : 2

        System.out.println(sb10.lastIndexOf("l"));         // Output : 9
    ```





   
