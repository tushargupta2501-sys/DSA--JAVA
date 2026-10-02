class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;

       
        for (int i = 0; i < n; i++) {
            HashSet<Character> set = new HashSet<>();

            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                if (set.contains(board[i][j])) {
                    return false;
                }

                set.add(board[i][j]);
            }
        }

        for (int i = 0; i < n; i++) {
            HashSet<Character> set = new HashSet<>();

            for (int j = 0; j < n; j++) {
                if (board[j][i] == '.') {
                    continue;
                }

                if (set.contains(board[j][i])) {
                    return false;
                }

                set.add(board[j][i]);
            }
        }

        for (int row = 0; row < n; row += 3) {
            for (int col = 0; col < n; col += 3) {

                HashSet<Character> set = new HashSet<>();

                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {

                        if (board[i][j] == '.') {
                            continue;
                        }

                        if (set.contains(board[i][j])) {
                            return false;
                        }

                        set.add(board[i][j]);
                    }
                }
            }
        }

        return true;
    }
}