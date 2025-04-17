class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<double[]> cars = new ArrayList<>();
        for(int i = 0; i < position.length; i++){
            cars.add(new double[]{position[i], speed[i]});
        }
        
        cars.sort((a, b) -> Double.compare(b[0], a[0]));

        Double[] restTime = new Double[position.length];

        for(int i = 0; i < restTime.length; i++){
            restTime[i] = (target - cars.get(i)[0]) / cars.get(i)[1];
        }

        Stack<Double> st = new Stack<>();

        st.push(restTime[0]);
        for(int i = 1; i< position.length; i++){
            if(!st.isEmpty() && st.peek() >= restTime[i]){
                continue;
            }else{
                st.push(restTime[i]);
            }
        }

        return st.size();
    }
}