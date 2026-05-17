class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String ch: operations){
            if(ch.equals("+")){
                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(a+b);
            } else if(ch.equals("D")){
                stack.push(2*stack.peek());
            } else if(ch.equals("C")){
                stack.pop();
            } else{
                stack.push(Integer.parseInt(ch));
            }
        }
        int sum = 0;
        for(int x: stack) sum += x;
        return sum;
    }
}