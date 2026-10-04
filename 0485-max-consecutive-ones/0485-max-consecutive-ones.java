class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int n = nums.length;
        int maximum =0;
 int max = 0;


        for ( int i =0; i < n; i++){
           
            if (nums[i] != 1 ){
                max =0;

                
            }
            else{
                max++;
            }
            maximum = Math.max(max, maximum);
            

            
        }
        return maximum;
    }
}