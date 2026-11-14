class Solution {
    public boolean isPalindrome(String s) {
        String s1 = "";
        //Step 1 clean the String
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                s1 += Character.toLowerCase(ch);
            }
        }

        String rev = "";
        //Step 2 reverse and compare
        for(int i = s1.length() - 1; i>=0; i--){
            rev += s1.charAt(i);
        }
        return rev.equals(s1);
    }
}
