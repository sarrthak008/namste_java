import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("ENTER THE FIRST NUMBER: ");
          int A = sc.nextInt();
        System.out.print("\nENTER THE SECOND NUMBER: ");
          int B = sc.nextInt();
        System.out.print("\nENTER THE OPERATOR: ");
        char oprator = sc.next().charAt(0);
         switch (oprator) {
            case '+':
                System.out.println(A+B);
                break;

            case '-':
                System.out.println(A-B);
                break;

            case '*':
                System.out.println(A*B);
                break;

            case '/':
                System.out.println(A/B);
                break;

            case '%':
              System.out.println(A%B);
              break;

            default:
            System.out.println("WRONG OPERATOR");
                break;
         } 
    } 
}
