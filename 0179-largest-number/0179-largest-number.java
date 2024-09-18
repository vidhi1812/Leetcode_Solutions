class Solution {
    public String largestNumber(int[] nums) {
        
      
        String[]  numStrs= new String[nums.length];
        for(int i=0;i<nums.length;i++){
            numStrs[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(numStrs,(a,b)-> (b+a).compareTo(a+b));
        if(numStrs[0].equals("0")){
            return "0";
        }
        StringBuilder output=new StringBuilder();
        for(String numStr:numStrs){
            output.append(numStr);
        }
        return output.toString();
    }
}