import java.util.Scanner;

public class prime {

     public static boolean _isPrime(int n) {
          if (n == 2) {
               return (true);
          } else {

               for (int i = 2; i <=Math.sqrt(n); i++) {
                    if (n % i == 0) {
                         return (false);
                    }
               }
          }
      return true;
     }

     public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.print("ENTER THE NUMBER: ");
           int n = sc.nextInt();
           if(_isPrime(n)){
                System.out.print(n + " is a prime number");
           }else{
               System.out.print(n + " is not a prime number");
           }
     }

}