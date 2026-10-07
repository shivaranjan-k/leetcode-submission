class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int n = A.length;
        boolean ans[] = new boolean[n];
        int res[] = new int[n];
        int count = 0;
        for(int i = 0;i < n;i++){

          if(ans[A[i] - 1]) count++;
          else ans[A[i] - 1] = true;

          if(ans[B[i] - 1])count++;
          else ans[B[i] - 1] = true;

          res[i] = count;

        }
        return res;
        
    }
}