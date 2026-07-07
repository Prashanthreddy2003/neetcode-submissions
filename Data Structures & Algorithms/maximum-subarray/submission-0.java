class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int size=1;size<=nums.length;size++){
            for(int i=0;i<=nums.length-size;i++){
                int sum=0;
                for(int j=i;j<i+size;j++){
                    sum=sum+nums[j];
                }
               max=Math.max(max,sum);
                sum=0;

            }
        }
        return max;
        
    }
}
