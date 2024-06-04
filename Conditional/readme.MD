## Conditional Statement


## if-else

```java

if(condition){
    //if condition was true
}else{
  // else run this part
}

---------------------

eg:

  int age = 20;

  if(age>=18){
    System.out.println("YOU VOTE");
  }else{
    System.out.println("YOU CAN'T VOTE");
  }

```

## else if

```java
if(condition){


}else if(condition){


}else{


}

eg:

int age = 13;

if(age>=18){
  System.out.print("ADULT");
}else if(age>=13 && age age < 18){
  System.out.print("TEEN AGE");
}else{
  System.out.print("child");
}


```

## Ternary Operator

`variable = condition ? statement 1: statement 2;`
```java
int larger= (5>3)?5:3;

String type=(5%2==0)?"even":"odd";
```

## Switch Statements 
````java

switch(variable){

case 1: break;

case 2: break;

case 3:break;

default:

}

````
