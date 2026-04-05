class Solution {
    public int longestConsecutive(int[] nums) {
        int n =nums.length;
        Arrays.sort(nums);
        int cnt=0;
        for(int i=0;i<n-1;i++){
            if((nums[i+1]-nums[i])==1){
                cnt++;
            }
        }
        return cnt+1;
    }
}
