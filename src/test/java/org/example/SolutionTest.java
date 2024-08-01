package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void evalRPNTest() {
        Solution solution = new Solution();
        assertEquals(9, solution.evalRPN(new String[]{"2","1","+","3","*"}));
        assertEquals(6, solution.evalRPN(new String[]{"4","13","5","/","+"}));
        assertEquals(22, solution.evalRPN(
                new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}