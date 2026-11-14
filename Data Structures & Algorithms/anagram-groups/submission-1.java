class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Step 1 Sort the String and add in HashMap
        HashMap<String,List<String>> map = new HashMap<>();

        for(int i = 0; i<strs.length; i++){
            String str = strs[i];
            char []ch = str.toCharArray();
            Arrays.sort(ch);
            String str2 = new String(ch);
            //Step 2 jo na hoto key mai sorted add and value mai original add
            
            if(!map.containsKey(str2)){
                List<String> list1 = new ArrayList<>();
                list1.add(str);
                map.put(str2, list1);
            } else{
                //agar hoto value mai original Store
                map.get(str2).add(str);
            }
        }
        //Step 3 ab Sari value list mai add karo aur return 
        List<List<String>> list = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            list.add(entry.getValue());
        }
        return list;
    }
}
