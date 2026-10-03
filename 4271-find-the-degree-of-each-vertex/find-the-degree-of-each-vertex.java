class Solution {
    public int[] findDegrees(int[][] matrix) {

        int res[] = new int[matrix.length];
        int j = 0;

        for(int n[]:matrix){
            int count = 0;
            for(int i = 0;i < n.length;i++){
                  if(n[i] == 1)count++;
            }
            res[j] = count;
            j++;
         
        }
        return res;

        
    }
}