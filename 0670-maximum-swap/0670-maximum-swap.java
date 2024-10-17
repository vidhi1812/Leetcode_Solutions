class Solution {
    public int maximumSwap(int num) {
        char[] digit= Integer.toString(num).toCharArray();
        int[] last= new int[10];
          for(int i=0;i<digit.length;i++){
               last[digit[i]-'0']=i;
              
          }
        for(int i=0;i<digit.length;i++){
             for (int j=9;j > digit[i]-'0';j--){
                 if(last[j] >  i){
                     char temp=digit[i];
                     digit[i]=digit[last[j]];
                     digit[last[j]]=temp;
                     
                     return Integer.parseInt(new String(digit));
                 }
             }
          }
return num; 
    }
}