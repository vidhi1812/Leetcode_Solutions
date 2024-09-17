class Solution {
    public String[] uncommonFromSentences(String str1, String str2) {
         
        String combination=str1+" "+str2;
        String[] combined=combination.split(" ");
        Map<String,Integer> words=new HashMap<>();
        for(String word:combined)
        {  
            words.put(word,words.getOrDefault(word,0)+1);
        }
        List<String>uncommon=new ArrayList<>();
        for(String word:words.keySet()){
            if(words.get(word) == 1){
                uncommon.add(word);
            }
        }
        return uncommon.toArray(new String[0]);
    }
}