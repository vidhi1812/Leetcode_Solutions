import java.util.*;
class Solution {
    public int specialArray(int[] nums) {
       int[] arr1= new int[nums.length+1];
         for(int i=0;i<nums.length;i++){
             if(nums[i] > nums.length){
                 arr1[nums.length]++;
         }
             else{
               arr1[nums[i]]++;
             }
         }
        int output=0;
        for(int i=nums.length;i> 0;i--){
            output+=arr1[i];
            if(output == i){
                return i;
            }
            
        }
    return -1;
    }
}