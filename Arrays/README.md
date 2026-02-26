1. 1D Array
2. 2D Array
3. Jagged Array
4. Array class methods

<br><br>
## 1. 1D Array: 
   Array is a fixed size container used to store multiple values of the same data type in continuous memory locations.

  - One variable - many values
  - Syntax :
      ```java
      int[] arr = new int[5];
      ```
  - Can store 5 integers.
  - Access them using 0 indexing.
      ```text
    Index:   0   1   2   3   4
    Value:  [ ] [ ] [ ] [ ] [ ]
      ```

  ### Array Size Rule
        ```java
      int[] arr = new int[5];
      ```
  - When array is created, size become fixed.
  - Cannot change the size later.

    #### Manual Resize
    - Create new array
    - Copy old data
   
    #### Mainly two ways to resize an array.
    - Via loop:
      ```java
      int[] arr = {10,20,30};
      int[] newArr = new int[6];

      for(int i=0;i<arr.length;i++){
          newArr[i] = arr[i];
      }

      arr = newArr;

       ```
    - Via Arrays.copyOf() method
      ```java
      import java.util.Arrays;s

      public class OneDArray01 {
          public static void main(String[] args) {

              int arr[] = { 1, 2, 3, 4, 5 };
              System.out.println(arr.length);     // Output : 5
              for (int a : arr) {
                  System.out.print(a + " ");      // Output : 1 2 3 4 5 
              }
              System.out.println();

              int arr1[] = Arrays.copyOf(arr, 10);
              System.out.println(arr1.length);    // Output : 10
              for (int aa : arr1) {
                  System.out.print(aa + " ");     // Output : 1 2 3 4 5 0 0 0 0 0 
              }

          }
      }

      ```

  ### Array Size Rule
| Data Type     | Default Value |
| ------------- | ------------- |
| int           | 0             |
| double        | 0.0           |
| boolean       | false         |
| String/Object | null          |
  

    
<br><br><br><br>
## 2. 2D Array:
A 2D Array means Array inside another array.
- Table/Matrix (rows x columns)


### Syntax: 
```java
int[][] arr = new int[3][3];
                    // [row][column]
// Meaning 3 row and 3 column => 3 x 3 => 9 elements
```


### Visual Understanding: 
```text
        Column
          0   1   2
        ─────────────
Row 0 | 10  20  30
Row 1 | 40  50  60
Row 2 | 70  80  90
```
  
### Initialization Methods
1. Method 1
   ```java
   int[][] arr = new int[2][3];

   arr[0][0] = 10;
   arr[0][1] = 20;
   arr[1][0] = 30;
   ```
2. Method 2
   ```java
   int[][] arr = {
    {10,20,30},
    {40,50,60}
   };
   ```

### Access format:

```text
array[row][column]
```
### 2D Array Example: 
```java

public class TwoDArray {
    public static void main(String[] args) {

        int arr[][] = new int[3][2];
        int arr1[][] = {
                { 1, 2 },
                { 3, 4 },
                { 5, 6 } };
        // 3 row and 2 column

        for (int row = 0; row <= 2; row++) {

            for (int column = 0; column <= 1; column++) {
                System.out.print(arr1[row][column]);
            }
            System.out.println();
        }

        System.out.println(arr1.length);

    }
}

```
### Output : 
```
12
34
56
3

```
