
## functions in java
 
 Functions is the block of code that perform particular task
 
 ### syntax

 ```java
   return Type name(){
      //body
      return statement;

   }
 ```

```java
public class helloFun {

    //our hellow created functon thats cant return any thing
       public static void printHelloWorld(){
        System.out.println("HEllO WORlD");
        //return;
       }
     public static void main(String[] args) {
        printHelloWorld();
     }
}
```

 we use reuse the function

### which code written under the class is known as a ``methods``

class contains multiple function.


## with Parameters

```java

 return type name(type param1,type param2){
   //body
   return statement;
 }

```
[function for addition](./addFun.java)

### about parameters

```java
 
 public static int Sum(int A, int B){
     return (A+B);
   } // fromal parameters int A, int B



Sum(10,20); // arguments or actual parameters

```

### What happens in memory
 function also occupy in java thats save in ``call stack``
 ```css
 |   |
 |   |
 -----
 |   |
 -----   <====| call stack 
 |   |
 ----- 
 |   |
 -----
 ```
 call stack track which function call ,which function in stack
 when function call memory reserve in stack

 ## call by value
  [see here](./swap.java)


### method or functions have two type
> user define <br>
> pre define (inbuild methods)

### Function overloading 
Multiple  Functions with the Same name but different parameters

#### Function Overloading with number of parameters 
  ```java
   // sum of two numbers..

   public static int Sum(int A,int B){
    return (A+B);
   }

  //sum of three numbers...

   public static int Sum(int A,int B,int C){
    return (A+B+C);
   }
 
 // these is totally valid functions


/*if return type different  java give error ..  functon overloading not depends on return type it 

depends on number of PARAMETERS OR TYPE OF PARAMETERS
*/
  ```

  
#### Function Overloading with type of parameters 
  ```java
    // sum of int type of parameters
     public static int Sum(int A,int B){
      return(A+B);
     }
 
   // calculate float sum

   public static float Sum(float A,float B){
      return(A+B);
     }
     
   ```
   [code for find 2 to n all primes](./ranePrime.java)


### BINARY TO DECIMAL

```
 ==================================================
   
 LOGIC TO CONVERT BINARY TO DECIMAL

  IF BINARY NUMBER N = 101
  WE WANT CONVERT THIS NUMBER INTO DECIMAL

     1     0      1
     |     |      |
     *  +  *   +  *
  2POW2   2POW1   2POW0


2POW0 = 1
2POW1 = 2
2POW2 = 4

1*1 + 2*0 + 4*1 = 1+0+4=5

BINARY 101 CONVERT 5 INTO DECIMAL.

```
[code for binary to decimal](./binaryToDecimal.java)

```java
 ==================================================
   
 LOGIC TO CONVERT DECIMAL TO BINARY

 consider given decimal number is 7

   2 |   7         =>1   
 ____|___________        ↑
   2 |   3         =>1   |
 ____|___________        |
   2 |   1         =>1   |
_____|____________       |
     |  0
     |
 
 HERE GIVEN DEICIMAL NUMBER IS 7. 
 WHEN WE CONVERT DECIMAL TO BINARY WE DEVIDE GIVEN NUMBER BY 2 .
  1] WE DEVIDE 7 BY 2 AND  QUOTIENT 3 AND  REMIDER WILL BE 1
  2] NOW WE DEVIDE QUOTIENT BY 2 THAT IS 3 DEVIDED BY 2 AND
  AGAIN REMINDER WILL BE 1
  3]WE DEVIDED UNTIL QUOTIENT NOT MAKE ZERO
  4] NOW WE WRTE REMIDERS DOWN TO UP THAT IS `111`
  5] AND 7 WILL BE MAKE IN BINARY  `111`
  

```
[CODE FOR DECIMAL TO BINARY](./decimalToBinary.java)

## scope

1] method scope :  when we define veriable in function we access only under the function
 