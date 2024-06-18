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

```java
System.out.print(mark.length)

//give array lenght....
```

### how  pass array as an argument..

array is passing by refrence means if array change in function its also change in original array


```java

 public static void Updatemarks(int marks[]){
       
       for(i=0;i<marks.length,i++){
         marks[i]= marks[i]+1;
       }

 }
  
   public static void main(String args[]){
      int marks[]={90,95,76};

      Updatemarks(marks);

     // after adding 1 in 

            for(i=0;i<marks.length,i++){
                System.out.println(marks[1]);
            }

   }


```
[linear Search](../Linear-Search/)
