import java.util.Scanner;

public class facto {
     public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("ENTER THE NUMBER: ");
         int Num = sc.nextInt();
         int factorial=1;
           for(int i=Num;i>=1;i--){
               factorial=i*factorial;
           }
        System.out.print("FACTRORIAL OF " +Num+ " is "+factorial);
     }
}
