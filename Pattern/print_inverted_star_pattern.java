package Pattern;

public class print_inverted_star_pattern {
    public static void main(String args[]){
printInvertedStarPattern(4);
    }
    public static void printInvertedStarPattern(int lines){
        for(int i = 1; i <= lines; i++){
            for(int j = 1; j <= lines - i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
