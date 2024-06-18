
public class linear {
     public static int LinearSearch(int arr[],int key){
        
        for(int i=0;i<arr.length;i++){
              if(arr[i]==key){
                return i+1;
              }
        }
      return -1;
     }

     public static void main(String[] args) {
        
         int numArr[]={10,20,30,40,50,60,70,80,90};
         int key = 40;
         int result = LinearSearch(numArr, key);
          if(result == -1){
            System.out.println("key not found..");
          }else{
            System.out.println("key found at number "+result);
          }
         
     }
}
