class Solution {
    public int matrixScore(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            if(grid[i][0]==0){
                for(int j=0;j<m;j++){
                    if(grid[i][j]==0){
                        grid[i][j]=1;
                    }
                    else{
                        grid[i][j]=0;
                    }
                }
            }
        }
        
        for(int i=1;i<m;i++){
            int zero=0;
            int one=0;
            for(int j=0;j<n;j++){
                if(grid[j][i]==0){
                    zero++;
                }
                else{
                    one++;
                }
            }
            if(zero>one){
                for (int k=0;k<n;k++){
                    if(grid[k][i]==0){
                        grid[k][i]=1;
                    }
                    else{
                        grid[k][i]=0;
                    }
                }
                
            }
        }
        int ans=0;
        String val="";
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                val=val+grid[i][j];
                
            }
            ans+= Integer.parseInt(val, 2);
            val="";
            
        }
        return ans;
    

    }
}