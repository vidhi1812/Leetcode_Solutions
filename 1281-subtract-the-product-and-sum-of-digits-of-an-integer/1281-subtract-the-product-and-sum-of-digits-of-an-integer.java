class Solution {
    public int subtractProductAndSum(int n) {
        
        
    int prod=1;
        int sum=0;
        
       while(n >0){
             int rev=n%10;
                       
                 sum=sum+rev;
             prod=prod*rev;
  n=n/10;
              
        }
        return prod-sum;
    }
}