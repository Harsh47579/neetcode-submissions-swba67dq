class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer,Integer>map=new HashMap<>(); 
       Arrays.sort(nums);int cnt=0;
       for(int i=0;i<nums.length-1;i++){
        
        if(nums[i]==nums[i+1]){
            cnt++;
        }else{
            cnt=0;
        }
        if(cnt>=nums.length/2){
            return nums[i];
        }
       }return -1;
    }
}