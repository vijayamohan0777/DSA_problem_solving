class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new TreeSet<>();
        for (int x : nums) {
            st.add(x);
        }

        int count = 0, j = 0;
        int[] arr = new int[st.size()];
        for (int x : st) {
            arr[j++] = x;
        }
          int ans=0;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] - arr[i - 1] != 1) {
                ans=Math.max(ans,count);
                count=1;
            } else {
               count++;
            }
        }
        ans=Math.max(ans,count);
        return ans;
    }
}