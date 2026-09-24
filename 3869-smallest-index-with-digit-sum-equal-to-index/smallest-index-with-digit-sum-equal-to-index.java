class Solution {
    private int sum(int n){
        int s = 0;
         while(n > 0){

            s += (n % 10);
            n /= 10;
         }
         return s;
    }

    public int smallestIndex(int[] nums) {
        
        for(int i = 0;i < nums.length;i++){
            if(nums[i] < 10){
                
                if(nums[i] == i){
                    return i;
                }
            }
            else{
                int n = sum(nums[i]);
                if(n == i){
                    return i;
                }

            }
        }
        return -1;

        
    }
}