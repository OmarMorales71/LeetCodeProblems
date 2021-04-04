package stacks;

import java.util.Stack;

public class LongestValidParentheses {

    public int longestValidParentheses(String s) {

        Stack<Character> stack = new Stack<Character>();
        Stack<Integer> tops = new Stack<Integer>();

        tops.add(-1); //top by default
        stack.add(')');

        char[] parentheses = s.toCharArray();
        int max = 0;
        for(int i = 0 ; i < parentheses.length; i++){
            if(parentheses[i]==')' && stack.peek()=='('){
                tops.pop();
                stack.pop();
                int newTop = tops.peek();
                max = Math.max(max, i-newTop);
            }else{
                stack.add(parentheses[i]);
                tops.add(i);
            }
        }
        return max;
    }

}
