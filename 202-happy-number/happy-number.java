class Solution {
    public boolean isHappy(int n) {
       Set<Integer> set=new HashSet<>();

       while(n!=1){
        if(set.contains(n)){
        return false;
        }
          set.add(n);
         int k=n;
         int sum=0;
         while(k!=0){
            int rem=k%10;
            sum+=rem*rem;
            k=k/10;
         }
            n=sum;
    }
    return true;
    }

}         