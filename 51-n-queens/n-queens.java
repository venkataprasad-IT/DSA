 class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new LinkedList<>();
        char[][] chess = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chess[i][j] = '.';
            }
        }

        solve(n, chess, 0, ans);
        return ans;
    }

    static void solve(int n, char[][] chess, int col, List<List<String>> ans) {
        if (col == n) {
            List<String> temp = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(chess[i]));
            }
            ans.add(temp);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (check(chess, i, col, n)) {
                chess[i][col] = 'Q';
                solve(n, chess, col + 1, ans);
                chess[i][col] = '.';
            }
        }
    }

    static boolean check(char[][] chess, int i, int j, int n) {
        int r = i;
        int c = j;

        // Check left
        while (c >= 0) {
            if (chess[r][c] == 'Q') return false;
            c--;
        }

        // Check upper-left diagonal
        r = i; c = j;
        while (r >= 0 && c >= 0) {
            if (chess[r][c] == 'Q') return false;
            r--; c--;
        }

        // Check lower-left diagonal
        r = i; c = j;
        while (r < n && c >= 0) {
            if (chess[r][c] == 'Q') return false;
            r++; c--;
        }

        return true;
    }
}
