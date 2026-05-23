class Solution {

    int n, m;

    // DFS function
    void dfs(int[][] grid, boolean[][] vis, int r, int c) {

        // Boundary check
        if (r < 0 || c < 0 || r >= n || c >= m)
            return;

        // Stop if cell is 0 or already visited
        if (grid[r][c] == 0 || vis[r][c])
            return;

        vis[r][c] = true;

        // Move in 4 directions
        dfs(grid, vis, r + 1, c);
        dfs(grid, vis, r - 1, c);
        dfs(grid, vis, r, c + 1);
        dfs(grid, vis, r, c - 1);
    }

    int numberOfEnclaves(int[][] grid) {

        n = grid.length;
        m = grid[0].length;

        boolean[][] vis = new boolean[n][m];

        // Traverse first and last column
        for (int i = 0; i < n; i++) {

            if (grid[i][0] == 1 && !vis[i][0])
                dfs(grid, vis, i, 0);

            if (grid[i][m - 1] == 1 && !vis[i][m - 1])
                dfs(grid, vis, i, m - 1);
        }

        // Traverse first and last row
        for (int j = 0; j < m; j++) {

            if (grid[0][j] == 1 && !vis[0][j])
                dfs(grid, vis, 0, j);

            if (grid[n - 1][j] == 1 && !vis[n - 1][j])
                dfs(grid, vis, n - 1, j);
        }

        // Count unvisited 1s
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 1 && !vis[i][j])
                    count++;
            }
        }

        return count;
    }
}

public class oneS {

    public static void main(String[] args) {

        int[][] grid = {

                { 0, 0, 0, 0 },

                { 1, 0, 1, 0 },

                { 0, 1, 1, 0 },

                { 0, 0, 0, 0 }

        };

        Solution obj = new Solution();

        int ans = obj.numberOfEnclaves(grid);

        System.out.println("Number of Enclaves: " + ans);

    }

}