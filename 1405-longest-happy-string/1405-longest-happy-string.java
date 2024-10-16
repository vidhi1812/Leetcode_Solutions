class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<LetterCount> pq = new PriorityQueue<>((x, y) -> y.count - x.count);

        // Add 'a', 'b', 'c' with their counts to the priority queue if their counts are greater than 0
        if (a > 0) pq.offer(new LetterCount('a', a));
        if (b > 0) pq.offer(new LetterCount('b', b));
        if (c > 0) pq.offer(new LetterCount('c', c));

        StringBuilder result = new StringBuilder();

        while (!pq.isEmpty()) {
            // Get the most frequent character
            LetterCount first = pq.poll();

            // Check the last two characters in the result to avoid "aaa", "bbb", or "ccc"
            int len = result.length();
            if (len >= 2 && result.charAt(len - 1) == first.letter && result.charAt(len - 2) == first.letter) {
                // If the most frequent character would violate the rule, use the second most frequent character
                if (pq.isEmpty()) break; // No other characters to use, return the result
                LetterCount second = pq.poll();
                result.append(second.letter);
                second.count--;
                if (second.count > 0) pq.offer(second); // Put back the second character if it still has counts left
                pq.offer(first); // Put back the first character
            } else {
                // Append the most frequent character
                result.append(first.letter);
                first.count--;
                if (first.count > 0) pq.offer(first); // Put it back if it still has counts left
            }
        }

        return result.toString();
    }

    // Helper class to store the character and its remaining count
    private static class LetterCount {
        char letter;
        int count;

        LetterCount(char letter, int count) {
            this.letter = letter;
            this.count = count;
        }
    }
}