import java.util.Scanner;

public class sumOfNatural {
    
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("ENTER THE VALUE OF N: ");
      int N = sc.nextInt();
      int couter = 0;
      int sum =0;
      while (couter<=N) {
         sum += couter;
         couter++;
      }
   System.out.println("sum:"+ sum);
   }

}
