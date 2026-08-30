class Solution {
    public boolean validMountainArray(int[] arr) {
        int i=1;
        boolean flag=true;
        while(i<arr.length){
        if(arr[i] >arr[i-1]){
            i++;
        }else{
            flag=false;
            break;
        }
    }

        if(i==arr.length  || i==1){
            return false;
        }else{
            flag=true;
        }
            while(i<arr.length){
                if(arr[i] <arr[i-1]){
                    i++;
                }else{
                    flag=false;
                    break;
                }
            }
          return flag;
    }
}