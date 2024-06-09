import java.util.Scanner;

public class bionomial {
    /*
      n
       c  = n!/R!(n-r)!
        r
     */
    public static int Fact(int n){
        int Factorial=1;
        for(int i=1;i<=n;i++){
             Factorial = Factorial * i;
        }
    return(Factorial);
    }

 public static int Binomial(int n,int r){
    int n_Fact = Fact(n);
    int r_Fact = Fact(r);
    int n_Minus_R = Fact(n-r);
    int final_ans = n_Fact/(r_Fact*n_Minus_R);
    return final_ans;
 }
 
  public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
    System.out.print("ENTER THE VALUE OF n: ");
    int n = sc.nextInt();
    System.out.print("ENTER THE VALUE OF r: ");
    int r = sc.nextInt();
     System.out.print("binomial factorial of "+ n +" and "+r+" is "+ Binomial(n, r));

  }


}
