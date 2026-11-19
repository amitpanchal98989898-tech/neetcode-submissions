class Solution {
    public boolean isValid(String s) {
        //Step 1 create a Stack
        Stack<Character> stack = new Stack<>();

        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            //Step 2 if open bracket add in stack
            if(ch == '{' || ch == '[' || ch == '('){
                stack.push(ch);
            } else{
                //step 3 if first bracket is close
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();

                if(ch == ')' && top!= '(' || ch == ']' && top != '[' || ch == '}' && top != '{'){
                    return false;
                }
            }
        }
        //step 4 if any bracket remains in stack or not
        return stack.isEmpty();
    }
}
