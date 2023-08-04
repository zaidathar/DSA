class Solution {
    public String[] operators = {"+","-","*","/"};
    public boolean contains(String s){
        for(String op : operators){
            if(op.equals(s))return true;
        }
        return false;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack();
        int res = 0;
        for(String s : tokens){
            if(!contains(s)){
                st.add(Integer.valueOf(s));
            }
            else{
                Integer num2 = st.pop() , num1 = st.pop();
                
                Integer temp = 0;
                if(s.equals("+"))temp = num1+num2;
                else if(s.equals("-"))temp = num1 - num2;
                else if(s.equals("*"))temp = num1*num2;
                else temp = num1/num2;
                
                st.add(temp);
            }
        }
        return (int)st.pop();
    }
}