#### java file extension : .java

#### main class name == file name in java

#### java compiler search main function to run the code 

### boilerplate code in java 
```java
public class javaBasic{
    public static void main(String[] args) {
        
    }
}

```

##### statement tarminator in java -->  ; 

### output in java 
```java
 System.out.print("hello world !");

```
<br>
> `S` is cpital in System <br>
<hr>

#### how run code 
> javac file.name <br>
> java file.name <br>
<br>

#### `println` print and give one line space <br>
 
 ``\n also use for tarminate line``

 ## variables in Java 
 <hr>
What is a variable?
In programming, a variable is a value that can change, depending on conditions or on information passed to the program

#### how define variable in java 
```java
  int a = 10;
  int b = 20;
  String name = "sarthak";

```
#### data types in java 
  
java is typed language thats means we define data type of variable 
eg : java , c, c++

#### primitive <br>
>byte <br>
>short <br>
>char <br>
>boolen <br>
>int <br>
>long <br>
>float <br>
>double <br>

#### Non-primitive <br>
>String <br>
>Array <br>
>Class <br>
>Object <br>
>interface <br>

 #### size of data type
  8 bits = 1 byte
  <hr>

  > byte : 1 byte <br>
  > short : 2 byte <br>
  > char : 2 byte <br>
  > boolean : 1 byte <br>
  > int : 4 byte <br>
  > long : 8 byte <br>
  > float : 4 byte <br>
  > double : 8 byte <br>

  #### comments in java 

  ```
  //single line comment 

  ```

  <br>

  ```
  /*
    multiline comment...
  */

  ```

  ### input in java :
  <hr>

  for input we make object of class 'Scanner'

  ```java

    import java.util.*  // util package of java

    Scanner sc = new Scanner(System.in); // create new object of class  scanner

    String input = sc.next(); // sc.next() capture the input 

    System.out.println(input);


  ```

  sc.next() caputure only one word

  #### input in java :-
  
  > next()  -> take single word input <br>
  > nextLine()  -> take line or pahragraph as input <br>
  > nextInt()  -> take Number as a input <br>
  > nextByte()  -> take byte as a input <br>
  > nextFloat()  -> take Float value as a input <br>
  > nextBoolean()  -> take Boolean value as a input  <br>
  > nextShort()  -> take Short NUmber as a input <br>
  > nextLong()  -> take Long number as a input<br>


### type of conversion in java

compatible conversion possible in java and
and destination type > source conversion


we convert int into float but cant convert int into boolean

```diff
+>byte->short->int->float->long->double
```
also called implicit or widaning conversion

#### type casting
```java
// float a= 25.12;
// int b = a; 

-give error..

float a = 25.12;
int b = (int) a;

o\p-> 25

```

also norrowing conversion or explicit conversion

#### characters conversion

```java

char ch = 'a';
int b =  ch;
System.out.print(b);

o\p-> 97

```


  
