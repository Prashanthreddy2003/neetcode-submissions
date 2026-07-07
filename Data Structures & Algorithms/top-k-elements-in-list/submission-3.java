class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int a=0;
        Set<Integer> keys=map.keySet();
        for(int x:keys){
            if(map.get(x)>=k){
                a++;
            }
        }

        int[] arr=new int[a];
        int m=0;
        for(int x:keys){
            if(map.get(x)>=k){
                arr[m]=x;
                m++;
                

            }
        }

        return arr;
        
    }
}
