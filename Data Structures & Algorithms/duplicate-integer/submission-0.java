class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean isFound=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                isFound=true;
            }
        }
        return isFound;
        
    }
}