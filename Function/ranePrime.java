//print all primes in range

import java.util.Scanner;

public class ranePrime {
       public static boolean _isPrime(int n){
          if(n==2){
             return true;
          }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                 if(n%i==0){
                     return false;
                 }
            }
          }
        return true;
       }


   public static void primesInRaneg(int n){
        for(int i=2 ;i<=n;i++){
             if(_isPrime(i)){
                  System.out.print(i + "\t");
             }
        }
   }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("ENTER THE NUMBER: ");
         int n = sc.nextInt();
         System.out.print("\n---primes number between 2 to" + n +"--\n");
         primesInRaneg(n);
    }

}
