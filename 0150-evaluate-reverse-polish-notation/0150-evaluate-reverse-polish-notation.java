import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st= new Stack<>();
        int tmp = 0;

        for(String str : tokens){
            switch(str){
                case "+":
                 int b = st.pop(); 
                 int a = st.pop();
                 tmp = a + b; 
                 st.push(tmp);
                 break;
                case "-":
                 b = st.pop(); 
                 a = st.pop();
                 tmp = a - b; 
                 st.push(tmp);
                 break;
                case "*":
                 b = st.pop(); 
                 a = st.pop();
                 tmp = a * b; 
                 st.push(tmp);
                 break;
                case "/":
                 b = st.pop(); 
                 a = st.pop();
                 if (b == 0) {
                        throw new ArithmeticException("Cannot divide by zero");
                    }
                 tmp = a / b; 
                 st.push(tmp);
                 break;
                default:
                st.push(Integer.parseInt(str));
            }
        }

        return st.pop();
    }
}