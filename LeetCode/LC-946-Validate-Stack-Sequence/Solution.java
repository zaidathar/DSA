class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
      // My First approach bit complicated , optimal solution in python
        Stack<Integer> stack = new Stack<Integer>();
        int p = 0 , i = 0;
        while(true){
            if(p > popped.length-1)break;
            else if(i > pushed.length-1 && popped[p] != stack.peek())break;

            if(i < pushed.length){
                stack.push(pushed[i]);
                i++;
            }

            while(true){
                if(p > popped.length-1 | stack.empty())break;
                if(popped[p] == stack.peek()){
                    stack.pop();
                    p++;
                }
                else break;
            }
        }

        return stack.empty();
    }
}
