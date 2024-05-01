class Solution {
    public String reversePrefix(String word, char ch) {
    int end = word.indexOf(ch);
        
        if (end == -1) 
            return word;
        
       
        char[] arr1 = word.toCharArray();
        
       
        int start = 0;
        while (start < end) {
            char temp = arr1[start];
            arr1[start] = arr1[end];
            arr1[end] = temp;
            start++;
            end--;
        }
        
        
        return new String(arr1);    
    }
}