import java.util.Scanner;

public class evenOdd {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");
        int num = sc.nextInt();
        if (num%2==0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}
