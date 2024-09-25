class Solution {
    class Trie{
        Trie[] chars = new Trie[26];
        int visited = 0;
    }
    public int[] sumPrefixScores(String[] words) {
        Trie tr = new Trie();
        int[] ans = new int[words.length];

        for(String word : words){
            Trie t = tr;
            for(int i = 0; i < word.length(); i++){
                int idx = word.charAt(i) - 'a';
                if(t.chars[idx] == null){
                    t.chars[idx] = new Trie();
                }
                t.chars[idx].visited++;
                t = t.chars[idx];
            }
        }

        int k = 0;
        for(String word : words){
            Trie t = tr;
            int sum = 0;
            for(int i = 0; i < word.length(); i++){
                int idx = word.charAt(i) - 'a';
                sum += t.chars[idx].visited;
                t = t.chars[idx];
            }
            ans[k++] = sum;
        }
        return ans;
    }
}