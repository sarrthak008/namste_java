import java.util.Scanner;

public class addFun {
  
   public static int Sum(int A, int B){
     return (A+B);
   }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE A ");
        int A = sc.nextInt();
        System.out.print("ENTER THE B");
        int B = sc.nextInt(); 
        System.out.println("SUM IS "+Sum(A,B));

        
    
  } 

}