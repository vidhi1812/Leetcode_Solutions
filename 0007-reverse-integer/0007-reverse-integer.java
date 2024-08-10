class Solution {
    public int reverse(int num) {
        long r,sum=0;
         while(num != 0){
             r= num %10;
             sum=sum*10+r;
             num=num/10;
         }
       if(sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE)
           return 0;
        else 
            return(int) sum;
    }
}