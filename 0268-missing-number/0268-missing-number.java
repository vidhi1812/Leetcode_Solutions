class Solution {
    public int missingNumber(int[] nums) {
   int expected=nums.length*(nums.length+1)/2;
       int actual=0;
         for(int i:nums){
        actual+=i;
         }
        return expected-actual;
    }
}