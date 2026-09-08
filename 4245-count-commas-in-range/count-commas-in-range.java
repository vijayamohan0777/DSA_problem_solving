class Solution {
    public int countCommas(int n) {
        if(n>=1000){
            return 1+(n-1000);
        }
        else return 0;
    }
}