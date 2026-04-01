class Solution {
    public String longestCommonPrefix(String[] strs) {
      int n=strs.length;  
      String ans="";
    char ch[]=strs[0].toCharArray();
    char ch1[]=strs[n-1].toCharArray();
      for(int i=0;i<strs[0].length();i++){
if(ch[i]==ch1[i]){
    ans=ans+ch[i];
}
if(ch[0]!=ch1[0]){
    return "";
}
      }
      return ans;
    }
}