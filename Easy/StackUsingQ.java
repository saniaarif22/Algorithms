class StackUsingQ {
    
    Queue one;
    
    StackUsingQ() {
        one = new LinkedList();
    }
    
    // Push element x onto stack.
    public void push(int x) {
        one.add(x);
        for(int i=0;i<one.size()-1;i++)
       {
           one.add(one.poll());
       }
        
    }

    // Removes the element on top of the stack.
    public void pop() {
        one.poll();
        
    }

    // Get the top element.
    public int top() {
        return (int) one.peek();
        
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return one.isEmpty();
        
    }
}