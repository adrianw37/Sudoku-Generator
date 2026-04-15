import java.util.*;

public class SudokuGenerator
{
    public static void main(String[] args)
    {
        int[][] board = new int[9][9];
        generateBoard(board);
        printBoard(board); //original
        board = randomizeBoard(board);
        printBoard(board); //board after being randomized
    }
    
    public static void generateBoard(int[][] board){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                board[i][j] = (i * 3 + i / 3 + j) % 9 + 1;
            }
        }
    }
    
    public static int[][] randomizeBoard(int[][] board){
        for (int i = 0; i < 3; i++) {
            int group = (int)(Math.random() * 3);
            int r1 = group * 3 + (int)(Math.random() * 3);
            int r2 = group * 3 + (int)(Math.random() * 3);
            int[] tempRow = board[r1];
            board[r1] = board[r2];
            board[r2] = tempRow;
            group = (int)(Math.random() * 3);
            int c1 = group * 3 + (int)(Math.random() * 3);
            int c2 = group * 3 + (int)(Math.random() * 3);

            for (int j = 0; j < 9; j++){
                int temp = board[j][c1];
                board[j][c1] = board[j][c2];
                board[j][c2] = temp;
            }
        }
        return board;
    }
    
    public static void printBoard(int[][] board){
        System.out.println("+-------+-------+-------+");
        for (int i = 0; i < board.length; i++){
            if (i%3 == 0 && i != 0){
                System.out.println("+-------+-------+-------+");
            }
            for (int j = 0; j < board[i].length; j++){
                if (j%3 == 0){
                    System.out.print("| ");
                }
                System.out.print(board[i][j] + " ");
                if (j == board[i].length-1){
                    System.out.print("|");
                }
            }
            System.out.println();
        }
        System.out.println("+-------+-------+-------+");
    }
}