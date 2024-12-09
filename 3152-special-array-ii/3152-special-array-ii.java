class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] res = new boolean[queries.length];
        int c = 0;
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 1; i < nums.length; i++) {
            if ((nums[i - 1] + nums[i]) % 2 == 0) {
                set.add(i - 1);
            }

        }
        for (int[] q : queries) {
            if (set.lower(q[1]) != null && set.lower(q[1]) >= q[0])
                res[c++] = false;
            else
                res[c++] = true;

        }

        return res;

    }
}