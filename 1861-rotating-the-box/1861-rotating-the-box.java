class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int rows = box.length, cols = box[0].length;
        char[][] result = new char[cols][rows]; // Initialize result matrix
        
        // Fill the result matrix with empty spaces
        for (char[] row : result) {
            java.util.Arrays.fill(row, '.');
        }

        // Process each row of the box
        for (int i = 0; i < rows; i++) {
            int emptyPosition = cols - 1; // Track the lowest position for stones
            for (int j = cols - 1; j >= 0; j--) {
                if (box[i][j] == '*') {
                    // Obstacle: place it in the result and reset the empty position
                    result[j][rows - i - 1] = '*';
                    emptyPosition = j - 1;
                } else if (box[i][j] == '#') {
                    // Stone: move it to the lowest available position
                    result[emptyPosition][rows - i - 1] = '#';
                    emptyPosition--;
                }
            }
        }
        
        return result;
    }
}