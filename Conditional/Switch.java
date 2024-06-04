import java.util.*;

public class Switch {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("ENTER THE NUMBER AND GET A DAY");
     int num = sc.nextInt();
     switch (num) {
        case 1:
          System.out.println("ITS SUNDAY");    
          break;
        case 2:
          System.out.println("ITS MONDAY");    
          break;
        case 3:
          System.out.println("ITS TUESDAY");    
          break;
        case 4:
           System.out.println("ITS WENSDAY");    
           break;
        case 5:
            System.out.println("ITS THURSDAY");    
            break;
        case 6 :
             System.out.println("ITS FRIDAY");    
             break;
        case 7:
             System.out.println("ITS SATURDAY");    
             break;
        default:
               System.out.println("NOT FOUND DAY FOR NUMBER"+ num);
            break;
     }
  }
}