class Solution {
    public boolean isAnagram(String s, String t) {
// char ch[]=s.toCharArray();
// char ch1[]=t.toCharArray();
// Arrays.sort(ch);
// Arrays.sort(ch1);
// if(Arrays.equals(ch,ch1)){
//     return true;
// }
// return false;
Map<Character,Integer>map=new HashMap<>();
if(s.length()!=t.length()){
    return false;
}
for(char c:s.toCharArray()){
    map.put(c,map.getOrDefault(c,0)+1);
}
for(char c:t.toCharArray()){
    if(!map.containsKey(c) || map.get(c)==0){
        return false;
    }
    else{
        map.put(c,map.get(c)-1);
    }
}
return true;
    }
}
