class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
         int[] sorted= nums.clone();
         Arrays.sort(sorted);
        
         List<Integer> result= new ArrayList<>();
         for(int i=0;i<sorted.length;i++){
             if(sorted[i] ==  target){
                 result.add(i);
             }
             
         }
        return result;
    }    
       
}