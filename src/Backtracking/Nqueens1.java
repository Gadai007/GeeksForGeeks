package Backtracking;

public class Nqueens1 {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        queen(board, 0);
    }
    public static void print(boolean[][] board){
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[i].length ; j++) {
                if(board[i][j]){
                    System.out.print("Q");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean issafe(boolean[][] board, int row, int col){
        for (int i = 0; i <row ; i++) {
            if(board[i][col]){
                return false;
            }
        }

        int left = Math.min(row,col);

        for (int i = 1; i <=left ; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }

        int right = Math.min(row, board.length-col-1);
        for (int i = 1; i <=right ; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    public static void queen(boolean[][] board, int row){
        if(row == board.length){
            print(board);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if(issafe(board, row, col)){
                board[row][col] = true;
                queen(board,row+1);
                board[row][col] = false;
            }
        }
    }
}
