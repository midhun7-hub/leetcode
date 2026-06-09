class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long a = Integer.MAX_VALUE;
        long b = Integer.MIN_VALUE;
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            a = Math.min(Math.min(nums[l],nums[r]),a);
            b = Math.max(Math.max(nums[l],nums[r]),b);
            l++;
            r--;
        }
        return (long)((b-a)*k);
    }
}