package org.example;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int tempOne = stack.pop();
                int tempTwo = stack.pop();
                if (token.equals("+")) {
                    stack.add(tempOne + tempTwo);
                } else if (token.equals("-")) {
                    stack.add(tempTwo - tempOne);
                } else if (token.equals("*")) {
                    stack.add(tempTwo * tempOne);
                } else {
                    stack.add(tempTwo / tempOne);
                }
            } else {
                stack.add(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
}
