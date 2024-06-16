
public class hollow {

  public static void hollow_rect(int rows,int colos){
    //outer loop - rows
      for(int i =1; i<=rows;i++){
         // innner loop - coloumn
         for(int j=1;i<=colos;j++){
            //cell -(i,j)
              if(i==1 || j ==1 || i== rows || j == colos){
                 System.out.print("*");
              }else{
                 System.out.print(" ");
              }
         }
         System.out.print("");
      }
  }

  public static void main(String[] args) {
     hollow_rect(5, 4);
  }
    
}

//lastly learnpattern