class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        HashMap<String, Integer> hm= new HashMap<>();
        int max=0;
        for(int[] r: matrix){
            StringBuilder s= new StringBuilder();
            for(int i: r){
                s.append(i==r[0]? "0": "1");
            }
            hm.put(s.toString(), hm.getOrDefault(s.toString(), 0)+1);
            max= Math.max(max, hm.get(s.toString()));
        }
        return max;
    }
}