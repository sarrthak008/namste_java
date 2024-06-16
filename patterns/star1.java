

/* 1} think how many lines you want thats time outer loop runs
   2} number of times print char, star,num that number of time run inner loop
   3} what we print        

*/

public class star1 {
    public static void main(String[] args) {
         for(int line=1;line<=4;line++){
             for(int star=1;star<=line;star++){
               System.out.print("*");
             }
              System.out.println("\n");
         }
    } 
}

/*


*

**

***

****


 */