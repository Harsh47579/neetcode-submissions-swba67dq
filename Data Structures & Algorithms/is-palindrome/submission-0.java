class Solution {
    public boolean isPalindrome(String s) {
   s = s.replaceAll("[^a-zA-Z0-9]", "");
   s = s.toLowerCase();
char ch[]=s.toCharArray();

int n=ch.length;
int j=n-1;
for(int i=0;i<n/2;i++){
char temp=ch[i];
ch[i]=ch[j];
ch[j]=temp;
j--;
}
String str = String.valueOf(ch);
if(s.equals(str)){
  return true;
}
else{
  return false;
}

    }
}
