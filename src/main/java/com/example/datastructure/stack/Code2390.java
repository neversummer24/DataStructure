package com.example.datastructure.stack;

import java.util.Stack;

public class Code2390 {
    Stack<Character> stack = new Stack<>();

    public String removeStars(String s) {
        stack.clear();
        char [] chars = s.toCharArray();
        for (char aChar : chars) {
            stack.push(aChar);
            if (aChar == '*') {
                stack.pop();
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();


    }

    public static void main(String[] args) {
        Code2390 code2390 = new Code2390();
        System.out.println("RESULT:"+code2390.removeStars("erase*****"));
        System.out.println("RESULT:"+code2390.removeStars("leet**cod*e"));

    }
}
