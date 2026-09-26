class MinStack {
    Stack<Integer> minstack;
    Stack<Integer> stack;
    public MinStack() {
      minstack=new Stack();
      stack=new Stack();

    }
    
    public void push(int val) {
        stack.push(val);
        if (minstack.isEmpty()) {
            minstack.push(val);
        } else {
            minstack.push(Math.min(val, getMin()));
        }
    }
    
    public void pop() {
        stack.pop();
        minstack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
