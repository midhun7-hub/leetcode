class Solution {
    public int trap(int[] a) {
        int sum = 0;
        int l=0;
        int r=a.length-1;
        int left = 0;
        int right = 0;
        while(l<r){
            left = Math.max(left,a[l]);
            right = Math.max(right,a[r]);
            if(left<right){
                sum+=left-a[l];
                l++; 
            }
            else{
                sum+=right-a[r];
                r--;
            }
        }
        return sum;
    }
}