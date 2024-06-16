import java.util.Scanner;

public class inp {
    public static void main(String[] args) {
        
         int mark[]=new int[10];
         Scanner sc = new Scanner(System.in);

         System.out.print("ENTER MATH MARK: ");
         mark[0] =sc.nextInt();

         System.out.print("ENTER PHY MARK: ");
         mark[1]=sc.nextInt();

         System.out.print("ENTER CHEM MARK: ");
         mark[2]=sc.nextInt();

         System.out.println("MATH: " +mark[0] +"\n"+ "PHY: "+ mark[1]+"\n"+"CHEM: "+ mark[2]);
    }
}
