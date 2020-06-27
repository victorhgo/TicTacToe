package TicTacToe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cells: ");

        // gameField will store all input received from readField.
        char[][] gameField = readField(scanner);

        // We call the method printField to print the field correctly.
        printField(gameField);

    }
    /* In this method, we enter a String named enterLine containing all the elements
        from the field, and then organizes it inside gameField matrix.
     */
    public static char[][] readField(Scanner scanner) {

        char[][] gameField = new char[3][3];    // Creates a 3x3 matrix.
        String enterLine = scanner.nextLine();  // Enter the Elements for the field.

        // Iterates i and j to organize all the symbols inside gameField matrix
        for (int i = 0; i < gameField.length; ++i) {
            for (int j = 0; j < gameField[0].length; ++j){
                /* In this line, the program takes the gameField matrix and organizes
                    all the elements inside of it in the following way:
                    1 = reads our enterLine, takes the char at i and multiplies by i plus j.
                 **/
                gameField[i][j] = enterLine.charAt(gameField[i].length * i + j);
            }
        }
        // Returns gameField matrix with all elements organized.
        return gameField;
    }
    // This method will receive gameField with all elements organized and print it.
    public static void printField(char[][] gameField){

        System.out.println("---------");
        // 
        for (char[] chars : gameField) {
            System.out.print("| ");
            IntStream.range(0, gameField[0].length).mapToObj(j -> chars[j] + " ").forEachOrdered(System.out::print);
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------");

    }
}
