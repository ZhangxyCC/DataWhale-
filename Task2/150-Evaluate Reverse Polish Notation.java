class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            if(!s.equals("+") &&!s.equals("-")&&!s.equals("*")&&!s.equals("/")){
                stack.push(Integer.parseInt(s));
            }else{
                int b = stack.pop();
                int a = stack.pop();
                stack.push(helper(s, a, b));
            }
        }
        return stack.pop();
    }
    
    private int helper(String operator, int a, int b){
        if(operator.equals("+"))    return a + b;
        else if(operator.equals("-"))   return a - b;
        else if(operator.equals("*"))   return a * b;
        else    return a / b;
    }
}