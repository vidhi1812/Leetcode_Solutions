class Solution {
    public long dividePlayers(int[] skill) {
     
        Arrays.sort(skill);
        int i=0, j=skill.length-1;
        long sum = skill[i] + skill[j];
        long chemistry = 0;
        while(i < j){
            if(skill[i] + skill[j] == sum){
                chemistry += (skill[i] * skill[j]);
            }
            else{
                return -1;
            }
            i++;
            j--;
        }
        return chemistry;
    }
}