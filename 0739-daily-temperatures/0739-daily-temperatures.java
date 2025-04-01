import java.util.*;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int [] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            while(!st.isEmpty() && temperatures[st.peek()]< temperatures[i]){
                int prevIndex = st.pop();
                result[prevIndex] = i - prevIndex;
            }

            st.push(i);
        }

        return result;
    }
}
