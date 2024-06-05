import java.util.Scanner;

public class oneToN {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("ENTER THE VALE OF RANEG");
         int range = sc.nextInt();
         int counter =0;
           while (counter<=range) {
              System.out.print(counter+"\t");
              counter ++;
           }
    }
    
}
