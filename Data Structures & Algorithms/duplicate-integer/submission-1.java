class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean isFound=false;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    isFound=true;
                }
            }
        }
        return isFound;
        
    }
}