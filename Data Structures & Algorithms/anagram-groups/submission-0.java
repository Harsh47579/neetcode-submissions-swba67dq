class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        int n=strs.length;
        for(String s:strs){
char ch[]=s.toCharArray();
Arrays.sort(ch);
String str=new String(ch);
List<String> temp = new ArrayList<>();
if(!map.containsKey(str)){
map.put(str,temp);
}
map.get(str).add(s);
        }
         ArrayList<List<String>> ans = new ArrayList<>(map.values());
         return ans;
    }
}
