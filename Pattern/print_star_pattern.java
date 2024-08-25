package Pattern;

public class print_star_pattern {
    public static void main(String args[]){
        printStarPattern(4);
    }

    public static void printStarPattern(int lines){
        for(int i = 1 ; i <= lines; i++ ){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
