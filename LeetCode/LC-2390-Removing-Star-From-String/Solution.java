class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack();
        for (int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if( c == '*' && !st.empty()){
                st.pop();
                
            }
            else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();

        while(!st.empty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}
