public class factorial {
     
    public static int Fact(int n){
        int Factorial=1;
        for(int i=1;i<=n;i++){
             Factorial = Factorial * i;
        }
    return(Factorial);
    }

    public static void main(String[] args) {
        System.out.println(Fact(3));
    }
}