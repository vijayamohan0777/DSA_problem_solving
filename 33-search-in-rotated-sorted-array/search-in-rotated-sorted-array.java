class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;

        while (l <= r) {

            int mid = l + ((r - l) >> 1);

            if (nums[mid] == target) {
                ans = mid;
                break;

            } else if (nums[l] <= nums[mid]) {

                if (nums[l] <= target && nums[mid] > target) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }

            } else {

                if (nums[mid] < target && nums[r] >= target) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }

            }
        }

        return ans;
    }
}