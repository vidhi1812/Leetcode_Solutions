class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
        
        // Insert all numbers into the max-heap
        for (int num : nums) {
            maxHeap.add(num);
        }
        
        long score = 0;
        
        // Perform k operations
        while(k-->0){
            int n = maxHeap.poll();
            score+=n;
            maxHeap.offer((n+2)/3);
        }
        return score;
    }
}