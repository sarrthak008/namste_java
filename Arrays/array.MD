 ## Arrays 
  array is a collection of elements of same data type under one name  its store in continuos location

```java
index 0   1   2   3   4    5
    __________________________
    |   |   |   |   |   |   |     
   _|___|___|___|___|___|___|_
add  10   11  12  13  14  15

'address is continuos'
 ```
 <hr>

 ### opration on array
 > Create <br>
 > input <br>
 > Output <br>
 > Update <br>

 ### creating of array

 ```java
  datatype arrayName[]=new dataType[size];
 ```

 Eg:
  ```java
   int marks[]=new int[50];
    //arrays size is static..by default store zero 

int numbers[]={1,2,3};
int moreNumber[]={4,5,6};

String fruits[]={"apple","mango","orange"};

  ```

#### how take input?
 ```java
   int mark[]=new int[10];
   Scanner sc = new Scanner(System.in);
     System.out.print("ENTER MATH MARKS: ");
     mark[0]=sc.nextInt();

     System.out.print("ENTER PHY MARKS: ");
     mark[1]=sc.nextInt();

    System.out.print("ENTER CHEM MARKS: ");
     mark[2]=sc.nextInt();

  System.out.println("MATH:"+mark[0]+"\n"+"PHY:"+mark[1]+"\n"+"CHEM:"+mark[2]);

 ```

 [see array basic  code](./inp.java)