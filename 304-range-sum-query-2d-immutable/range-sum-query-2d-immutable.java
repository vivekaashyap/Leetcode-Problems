class NumMatrix {
    private int[][] prefix;
    public NumMatrix(int[][] m) {
        if(m == null || m.length == 0 || m[0].length == 0) return;
        int m1 = m.length;
        int n = m[0].length;
        prefix = new int[m1][n];
        for(int i = 0; i<m1; i++){
            for(int j = 0; j<n; j++){
                int top = (i>0)?prefix[i-1][j]:0;
                int left = (j>0)?prefix[i][j-1]:0;
                int topleft = (i>0 && j>0)?prefix[i-1][j-1]:0;
                prefix[i][j] = m[i][j]+top+left-topleft;
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int total = prefix[row2][col2];
        int top = (row1>0)?prefix[row1-1][col2]:0;
        int left = (col1>0)?prefix[row2][col1-1]:0;
        int topleft = (row1>0 && col1>0)? prefix[row1-1][col1-1]:0;
        return total - top - left + topleft;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */