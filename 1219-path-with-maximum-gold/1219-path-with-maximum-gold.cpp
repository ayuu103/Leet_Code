class Solution {
private:
    int maxGold = 0;
    vector<vector<int>> dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

public:
    int getMaximumGold(vector<vector<int>>& grid) {
        int row = grid.size(), col = grid[0].size();
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (grid[r][c] != 0) {
                    dfs(grid, r, c, 0);
                }
            }
        }
        return maxGold;
    }

private:
    void dfs(vector<vector<int>>& grid, int r, int c, int totalGold) {
        if (!isSafe(grid, r, c)) {
            maxGold = max(maxGold, totalGold);
            return;
        }
        int goldVal = grid[r][c];
        totalGold += grid[r][c];
        grid[r][c] = 0;
        for (auto& dir : dirs) {
            int newR = r + dir[0], newC = c + dir[1];
            dfs(grid, newR, newC, totalGold);
        }
        grid[r][c] = goldVal;
    }

    bool isSafe(vector<vector<int>>& grid, int r, int c) {
        return r < grid.size() && c < grid[0].size() && r > -1 && c > -1 && grid[r][c] != 0;
    }
};