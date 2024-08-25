public class binomial_coefficient {
    public static void main(String[] args) {
        System.out.println(binomialCoefficientCalculation(4, 2));
    }
    static int calculateFactorial(int number){
        int factorial = 1;
        for(int i = 1;i<= number;i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    static int binomialCoefficientCalculation(int n, int r){
        int fact_n = calculateFactorial(n);
        int fact_r = calculateFactorial(r);
        int fact_nmr = calculateFactorial(n-r);

        int binomial_coefficient_value = fact_n / (fact_r * fact_nmr);
        return binomial_coefficient_value;
    }
}
