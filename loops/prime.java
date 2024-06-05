import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER: ");
        int num = sc.nextInt();
        boolean isPrime =true;


        if (num==2) {
            isPrime=true;
        }else{
            for(int i=2;i<num-1;i++){
                if(num%i==0){
                    isPrime=false;
                }
            }
        }
          
        if (isPrime) {
            System.out.print(num+"\tis a prime number");
        }else{
            System.out.print(num+"\tis not a prime number");
        }

    }
}

/*  use (int i=2;i<math.floor(n);i++)
     math.floor give root of n this use to better efficiency 
     and fast work for the code 
*/