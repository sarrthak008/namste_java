public class swap {
   
    public static void Swap(int A, int B) {
        int temp;
        temp = A;
        A=B;
        B=temp;
         System.out.println("A"+A); 
         System.out.println("B"+B);
  
           /* successfull swap the values..
            
           but A and B are copy so it cant change in main function..
           in java every function work on call by values..

           every time we send copy of variable we cant send original value..

           */

    }

     public static void main(String[] args) {
      
           //swap of numbers
           int A= 10;
           int B=20;
           Swap(A,B);

     

     }
     
}
