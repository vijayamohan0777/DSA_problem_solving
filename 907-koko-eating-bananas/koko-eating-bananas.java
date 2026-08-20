class Solution {

    boolean check(int[] piles, int n, int speed, int h) {
        int hours = 0;
        for (int i = 0; i < n; i++) {
            // hours+= (int) Math.ceil( (double) piles[i]/speed);

            hours += (piles[i] + speed - 1) / speed;
            if(hours > h){
                return false;
            }
        }

        return hours <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length;
        int l = 1;
        int r = piles[n - 1];
        int ans = 0;
        while (l <= r) {
            int mid = l + ((r - l) >> 1);

            if (check(piles, n, mid, h)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}