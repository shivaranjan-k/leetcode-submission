class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int op1 = 0,op2 = 0;
        for(var num:tokens){
         switch(num){
            case "+":
                op1 = stack.pop();
                op2 = stack.pop();
                stack.push(op1+op2);
                break;
            case "*":
                op1 = stack.pop();
                op2 = stack.pop();
                stack.push(op1*op2);
                break;
            case "/":
                op1 = stack.pop();
                op2 = stack.pop();
                stack.push(op2/op1);
                break;
            case "-":
                op1 = stack.pop();
                op2 = stack.pop();
                stack.push(op2-op1);
                break;
            default:
                stack.push(Integer.valueOf(num));
          }
        }
        return stack.pop();
    }
}