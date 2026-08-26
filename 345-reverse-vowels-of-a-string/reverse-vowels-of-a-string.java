class Solution {

    boolean isvowel(char s){
        if(s=='a'||s=='A'||s=='e'||s=='E'||s=='i'||s=='I'||s=='o'||s=='O'||s=='u'||s=='U'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int f=0;
        int  l=arr.length-1;
        while(f<l){
            if(isvowel(arr[f]) && isvowel(arr[l])){
                char temp=arr[f];
                arr[f]=arr[l];
                arr[l]=temp;
                l--;
                f++;
            }else if( isvowel(arr[f])){
                l--;
            }else{
                f++;
            }
        }
       return new String(arr);
    }
}