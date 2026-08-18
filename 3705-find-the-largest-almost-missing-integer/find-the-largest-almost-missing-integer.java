class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= nums.length - k; i++) {
            Set<Integer> set = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            for (int x : set) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }

        }

        int max = -1;
        for (int x : map.keySet()) {
            if (map.get(x) == 1) {
                max = Math.max(max, x);
            }
        }
        return max;
    }
}