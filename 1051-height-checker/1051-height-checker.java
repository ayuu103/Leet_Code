class Solution {
    public int heightChecker(int[] heights) {
        int n;
        int count=0;
        n=heights.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=heights[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            if(heights[i]!=arr[i])
            {
                count++;
            }
        }
        return count;        
    }
}