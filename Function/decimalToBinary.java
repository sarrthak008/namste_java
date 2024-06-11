
public class decimalToBinary {

      public static void dTOb(int decimalNumber){
         int power=0;
         int binaryNumber =0;
          while (decimalNumber > 0) {
             int remainder = decimalNumber % 2 ;
             binaryNumber = binaryNumber+(remainder *(int)Math.pow(10, power));
             power++;
             decimalNumber=decimalNumber/2;
          }
        System.out.print(binaryNumber);
      }

  public static void main(String[] args) {
     dTOb(11);
  }
 
}