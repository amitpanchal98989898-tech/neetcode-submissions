class Solution {
    public boolean isValidSudoku(char[][] board) {
        //step 1 check valid format
        for(int i=0; i<board.length; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] != '.' && (board[i][j]<'1' || board[i][j]>'9')){
                    System.out.println("Sudoku is not valid");
                    return false;
                }
                    //step 2 all row and col check not conatian dup values
                    //for rows
                    char ch = board[i][j];
                    if(ch == '.') continue;
                    if(set.contains(ch)){
                        return false;
                    }
                    set.add(ch);
            }
        }
        //for cols
        for(int j = 0; j<board[0].length; j++){
            HashSet<Character> set = new HashSet<>();
            for(int i = 0; i<board.length; i++){
                if(board[i][j] != '.' && (board[i][j]<'1' || board[i][j]>'9')){
                    System.out.println("Sudoku is not valid");
                    return false;
                }
                    char ch = board[i][j];
                    if(ch == '.') continue;
                    if(set.contains(ch)){
                        return false;
                    }
                    set.add(ch);
            }
        }
        //for boxes
        // boxes
        for (int startI = 0; startI < 9; startI += 3) {
            for (int startJ = 0; startJ < 9; startJ += 3) {

                HashSet<Character> set = new HashSet<>();   // har box ke liye fresh

                for (int i = startI; i < startI + 3; i++) {
                    for (int j = startJ; j < startJ + 3; j++) {
                        char ch = board[i][j];
                        if (ch == '.') continue;
                        if (set.contains(ch)) return false;
                        set.add(ch);
                    }
                }
            }
        }
        return true;
    }
}
