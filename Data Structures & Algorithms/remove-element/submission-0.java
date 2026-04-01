class Solution {
    public int removeElement(int[] nums, int val) {
       int n=nums.length;int cnt=0;int j=0;
       int temp[]=new int[n];
for(int i=0;i<n;i++){
   if(nums[i]!=val){
    
   temp[j]=nums[i];
   j++;
   }
}
int k=0;
for(int i=0;i<j;i++){
nums[i]=temp[i];
k++;
}
return k;
    }
}