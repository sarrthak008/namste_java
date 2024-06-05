import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTET THE NUMBER: ");
        int num = sc.nextInt();
        String output = (num%2==0)?"even":"odd";
        System.out.println(output);
    }

}
