public class factorial {
    public static void main(String args[]){
       int fact = findFactorial(4);
        System.out.println(fact);
    }
    static int findFactorial(int number){
        int fact = 1;
        for(int i = 1;i<=number;i++){
            fact = fact * i;
        }
        return fact;
    }
}
