class Solution {
    
    public int evalRPN(String[] tokens) {
    Stack<Integer> stack=new Stack();
    int result=1;
    for(String s:tokens){
        if (!s.equals("+") && 
                !s.equals("-") && 
                !s.equals("*") && 
                !s.equals("/")) {

                stack.push(Integer.parseInt(s));
                }
        else{
           int b=stack.pop();
           int a=stack.pop();
            if (s.equals("+")) {
                    result = a + b;
                } else if (s.equals("-")) {
                    result = a - b;
                } else if (s.equals("*")) {
                    result = a * b;
                } else {
                    result = a / b;
                }
            stack.push(result);
          
        }
    }  
    return stack.pop();
    }
}
