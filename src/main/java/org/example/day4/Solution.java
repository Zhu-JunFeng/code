package org.example.day4;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || c != stack.pop()) return false;
        }
        return stack.isEmpty();
    }

    public static void show(String s) {
        for (char c : s.toCharArray()) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        show("(){}{}[]");
        System.out.println(isValid("(){}{}[]"));
    }
}