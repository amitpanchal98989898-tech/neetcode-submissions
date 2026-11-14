class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        if(s.length() == t.length()){
            for(int i = 0; i<s.length(); i++){
                char ch = s.charAt(i);
                char ch2 = t.charAt(i);
                if(!map.containsKey(ch)){
                    map.put(ch, 1);
                }else{
                    map.put(ch, (map.get(ch)) + 1);
                }

                if(!map2.containsKey(ch2)){
                    map2.put(ch2, 1);
                } else{
                    map2.put(ch2, (map2.get(ch2)) + 1);
                }
                
            }
            if(map.equals(map2)){
                return true;
            }
        } 
        return false;
    }       
}
