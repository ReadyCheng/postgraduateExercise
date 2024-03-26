package com.success.section3;

import java.util.Stack;

public class SuitableParentness {
    //合适的括号
    //1. () [] {}
    //2. ()

    public boolean parent(String s) {
        char[] array = s.toCharArray();
        int length = array.length;
        Stack<Character> stack = new Stack<>();
        for (char c : array) {
            if (c == '(' || c == '[' || c == '{') {
                stack.add(c == '(' ? ')' : c == '[' ? ']' : '}');
            } else {
                if (stack.isEmpty()) return false;
                char pop = stack.pop();
                if (pop != c) return false;
            }
        }
        return stack.isEmpty();
    }

    // only ()
    public boolean parent2(String s) {
        char[] array = s.toCharArray();
        int count = 0;
        for (char c : array) {
            count += c == '(' ? 1 : -1;
            if (count < 0) return false;
        }
        return count == 0;

    }
}
