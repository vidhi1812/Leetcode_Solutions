class Solution {
    public boolean checkIfExist(int[] arr) {

        int[] map = new int[2001] ;

        for(int num : arr)
        {
            map[num + 1000] ++ ;
        }

        if(map[1000] > 1) return true ;

        for(int num : arr)
        {
            if(num == 0) continue ;

            if(num % 2 == 0 && map[num/2 + 1000] > 0 ) return true ;
        }

        return false ;
        
    }
}