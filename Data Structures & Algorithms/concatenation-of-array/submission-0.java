class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int j=0;
        int arr[]=new int[2*n];
        for(int i=0;i<n;i++){
arr[i]=nums[i];
j++;
        }
       
        for(int i=0;i<n;i++){
arr[j++]=nums[i];
        }
        return arr;
    }
}