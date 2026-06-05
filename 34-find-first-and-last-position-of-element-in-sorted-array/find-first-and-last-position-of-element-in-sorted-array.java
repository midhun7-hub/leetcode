class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[]=new int[2];
        res[0]=search(nums,target,true);
        res[1]=search(nums,target,false);

        return res;
    }

    public int search(int []nums,int target,boolean b)
    {
        int l=0,h=nums.length-1,ind=-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(nums[mid]<target)
            {
                l=mid+1;
            }
            else if(nums[mid]>target)
            {
                h=mid-1;
            }
            else
            {
               ind=mid;
                if(b)
                {
                   h=mid-1;
                }
                else
                 {
                    l=mid+1;
                 }
            }
        }
        return ind;
    }
}