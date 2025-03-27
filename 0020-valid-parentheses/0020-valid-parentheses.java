import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        
        st.push(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            if(!st.isEmpty()){
                char c=st.peek();
                if(c == '(' &&  s.charAt(i) ==')'){
                    st.pop();

                }else if(c == '{' && s.charAt(i) == '}'){
                    st.pop();
              
                }else if(c == '[' && s.charAt(i) == ']'){
                    st.pop();
             
                }else{

                    st.push(s.charAt(i));
                }
            }
            else st.push(s.charAt(i));

        }

        for(char num : st) {
            System.out.print(num+" ");
        }
        if(!st.isEmpty()) return false;
        else return true;
    }
}
/**
    i=0 0 -> (
    i=1 ) -> st.pop(). => st    empty
    i=2 { -> st {
    i=3 } -> st.pop()  => st    empty
    i=4 } -> st }
    i=5 { -> st } {
 */