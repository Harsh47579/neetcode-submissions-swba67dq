class Solution {
    public int longestConsecutive(int[] nums) {
        int n =nums.length;
     Arrays.sort(nums);
        int cnt=1;int count=1;
        for(int i=1;i<n;i++){
          if(nums[i]==nums[i-1])continue;
          if(nums[i]==nums[i-1]+1){
            count++;
          }
          else{ count=1;
          }
          cnt=Math.max(cnt,count);
        }
       return cnt;
    }}