class Solution {
    public int trailingZeroes(int n) {
        int trailzero=0;
        while(n!=0){
            trailzero+=n/5;
            n=n/5;
        }
        return trailzero;
    }
}