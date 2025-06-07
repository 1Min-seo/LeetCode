import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();
        int result = 0;

        for(String token : tokens) {
            if(token.equals("+")) {
                int b = st.pop();
                int a = st.pop();

                result = a + b;
                st.push(result);
            }else if(token.equals("-")) {
                int b = st.pop();
                int a = st.pop();

                result = a - b;
                st.push(result);
            }else if(token.equals("*")) {
                int b = st.pop();
                int a = st.pop();

                result = a * b;
                st.push(result);
            }else if(token.equals("/")) {
                int b = st.pop();
                int a = st.pop();

                result = a/b;
                st.push(result);
            }else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.peek();
    }
}