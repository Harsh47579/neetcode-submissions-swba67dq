class Solution {
    public String longestCommonPrefix(String[] strs) {
      int n=strs.length;  
      String ans="";
      Arrays.sort(strs);
    char ch[]=strs[0].toCharArray();
    char ch1[]=strs[n-1].toCharArray();
    int x=0;
    if(strs[0].length()>strs[n-1].length()){
x=strs[n-1].length();
    }
    else{
       x=strs[0].length(); 
    }
      for(int i=0;i<x;i++){
if(ch[i]==ch1[i]){
    ans=ans+ch[i];
} else {
    break;
}
      }
      return ans;
    }
}