class Solution {
    public boolean isValidSudoku(char[][] board) {
        return rowCheck(board) && colCheck(board) && boxCheck(board);
    }

    private boolean rowCheck(char[][] board) {
        for (int row = 0; row < 9; row++) {
            Set<Character> set = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    continue;
                }
                if (set.contains(board[row][col])) {
                    return false;
                }
                set.add(board[row][col]);
            }
        }
        return true;
    }
    private boolean colCheck(char[][] board) {
        for (int col = 0; col < 9; col++) {
            Set<Character> set = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                if (board[row][col] == '.') {
                    continue;
                }
                if (set.contains(board[row][col])) {
                    return false;
                }
                set.add(board[row][col]);
            }
        }
        return true;
    }
    private boolean boxCheck(char[][] board) {
        Map<Integer, Set<Character>> map = new HashMap<>();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    continue;
                }
                int boxIndex = (row / 3) * 3 + (col / 3);
                if (map.get(boxIndex) == null) {
                    map.put(boxIndex, new HashSet<>());
                }
                if (map.get(boxIndex).contains(board[row][col])) {
                    return false;
                }
                map.get(boxIndex).add(board[row][col]);
            }
        }
        return true;
    }
}
