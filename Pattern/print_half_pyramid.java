package Pattern;

public class print_half_pyramid {
    public static void main(String args[]){
        printHalfPyramid(4);
    }
    public static void printHalfPyramid(int lines){
        for(int i = 1; i <= lines ; i++){
            for(int j = 1 ; j<= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
