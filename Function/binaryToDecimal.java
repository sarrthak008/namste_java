/*  Binary to decimal 
   Binary = 0,1
   decimal = 0,9;





public class binaryToDecimal {
      
    public static void BinTodec(int _binaryNum){
         int power=0;
         int _decNum=0;
           while(_binaryNum > 0){
                   int lastDigit = _binaryNum % 10;
                   _decNum = _decNum + (lastDigit * (int)Math.pow(2,power));
                   power++;
                   _binaryNum=_binaryNum/10; 
           }
        System.out.println(_decNum);
    }

      
}*/

import java.util.Scanner;

/**
 * binaryToDecimal
 */
public class binaryToDecimal {

  public static void BtoD(int BinaryNumber){

      int power = 0;
      int decimalNumber=0;

        while (BinaryNumber>0) {
           int lastDigit = BinaryNumber % 10 ;
            decimalNumber = decimalNumber +(lastDigit *(int) Math.pow(2, power));
            power++;
         BinaryNumber = BinaryNumber /10;
        }
   System.out.print("DECIMAL NUMBER IS " + decimalNumber);
 
  }


   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("ENTER THE BINARY NUMBER: ");
       int BinaryNumber=sc.nextInt();
       BtoD(BinaryNumber);
       
   }
}
