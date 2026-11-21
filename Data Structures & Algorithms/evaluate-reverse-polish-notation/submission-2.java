class Solution {
    public int evalRPN(String[] tokens) {
        //Step 1 if come number add in stack
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<tokens.length; i++){
            //Step 2 if it operator then pop numbers into stack and doing Operation
            if(tokens[i].equals("+")){
                ans = stack.pop() + stack.pop();
                stack.push(ans);
            } else if(tokens[i].equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                ans = b - a;
                stack.push(ans);
            }else if(tokens[i].equals("*")){
                ans = stack.pop() * stack.pop();
                stack.push(ans);
            }else if(tokens[i].equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                ans = b / a;
                stack.push(ans);
            } else{
                int num = Integer.parseInt(tokens[i]);
                stack.push(num);
            }
        }
        return stack.peek();
    }
}
