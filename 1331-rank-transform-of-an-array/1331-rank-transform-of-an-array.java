class Solution {
    public int[] arrayRankTransform(int[] arr) {
         int[] sortrr=arr.clone();
        Arrays.sort(sortrr);
        
        Map<Integer, Integer> rank=new HashMap<>();
         int ranks=1;
         for(int num:sortrr){
             if(!rank.containsKey(num)){
                 rank.put(num, ranks++);
             }
         }
        int[] result= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=rank.get(arr[i]);
        }
        return result;
    }
}