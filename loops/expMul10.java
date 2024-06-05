import java.util.Scanner;

public class expMul10 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("ENTER YOUR NUMBER: ");
            int A = sc.nextInt();
              if(A%10==0){
                continue;
              }
            System.out.println("your number is"+A);
        }while(true);
     }
}
