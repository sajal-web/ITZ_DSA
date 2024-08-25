package Pattern;

public class print_character_pattern {
    public static void main(String args[]){
        printCharacterPattern(4, 'A');
    }
    public static void printCharacterPattern(int lines, char key){
        for(int i = 1; i<= lines; i++){
            for(int j = 1; j<= i; j++){
                System.out.print(key+" ");
                key++;
            }
            System.out.println();
        }
    }
}
