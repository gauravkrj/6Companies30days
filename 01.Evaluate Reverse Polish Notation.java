class Solution {
    public int evalRPN(String[] tokens) {
      Stack<Integer> st = new Stack();
      for(String i : tokens){
          if("+-*/" .contains(i))
           st.push(eval(st.pop(), st.pop(), i));
          else
           st.push(Integer.parseInt(i));
      }  
       return st.pop();
    }

    private int eval(int b, int a, String op){
        if("+".equals(op))
          return a+b;
        else if("-".equals(op))
          return a-b;
        else if("*".equals(op))
          return a*b;
        else
          return a/b;
    }
}
