package strings.and.arrays;

import java.util.Arrays;

public class SurroundedRegions {
    public static void main(String[] args) {
        SurroundedRegions obj = new SurroundedRegions();

        char[][] board = new char[][]{{'O','X','X','O','X'},{'X','O','O','X','O'},{'X','O','X','O','X'},{'O','X','O','O','O'},{'X','X','O','X','O'}};
        obj.solve(board);
        System.out.println();
    }

    public void solve(char[][] board) {
        try{
            if(board==null || board.length<=2 || board[0].length<=2)
                return;
        }catch(Exception e){
            return;
        }

        int rows = board.length;
        int columns=board[0].length;

        for(int i = 0 ; i<rows;i++){
            if(board[i][0]=='O')
                boardDFS(board, i,0);
            if(board[i][columns-1]=='O')
                boardDFS(board,i,columns-1);
        }

        for(int i = 1 ; i<columns-1;i++){
            if(board[0][i]=='O')
                boardDFS(board, 0,i);
            if(board[rows-1][i]=='O')
                boardDFS(board,rows-1, i);
        }

        for(int i=0; i<rows;i++){
            for(int j = 0; j<columns;j++){
                if(board[i][j]=='O')
                    board[i][j]='X';
                else if(board[i][j]=='*')
                    board[i][j]='O';
            }
        }


    }

    private void boardDFS(char[][] board, int i, int j) {
        if(i<0 || i>board.length-1 || j<0 || j>board[0].length-1)
            return;

        board[i][j]='*';

        if(i>0 && board[i-1][j]=='O')
            boardDFS(board, i-1,j);
        if(i<board.length-1 && board[i+1][j]=='O')
            boardDFS(board, i+1,j);
        if(j>0 && board[i][j-1]=='O')
            boardDFS(board, i,j-1);

        if(j<board[0].length-1 && board[i][j+1]=='O')
            boardDFS(board, i,j+1);


    }


}
