class Solution {
    public boolean checkPerfectNumber(int num) {
        int total=0;
         for(int i=1;i<num;i++){
             if(num % i == 0){
                 total=total+i;
             }
         }
         if(total == num){
             return true;
         }
        else{
            return false;
        }
        
    }
}