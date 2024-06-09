import java.util.Scanner;

public class product {
     public static int Ans(int A ,int B){
          return(A*B);
     }
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE A: ");
        int A =sc.nextInt();
        System.out.print("ENTER THE B: ");
        int B = sc.nextInt();
        int result = Ans(A, B);
        System.out.print("product is:" +result);

     }


}
