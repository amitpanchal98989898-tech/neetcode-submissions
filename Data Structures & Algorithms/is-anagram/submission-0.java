class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String str1 = new String(a);
        String str2 = new String(b);

        if(str1.equalsIgnoreCase(str2)){
            return true;
        }
        return false;
    }
}
