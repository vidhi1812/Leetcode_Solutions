class Solution {
    public boolean isThree(int n) {
         int num=0;
        
         for(int i=1;i<=n;i++){
             if(n % i == 0){
                num=num+1;
             }
             
         }
        
        if(num == 3){
            return true;
        }
        else{
            return false;
        }
       
    }
}