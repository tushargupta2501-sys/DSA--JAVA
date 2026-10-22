class Solution {
    public int removeElement(int[] nums, int val) {
        int i =0;
        
        int n =nums.length;
        int k = 0;


        while ( i<n){
            if ( nums[i] != val){
                nums[k] = nums[i];
                i++;
                k++;

            }

         else{
            i++;
         }
        }
return k;
    }
}