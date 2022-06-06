package homework;

import bookExamples.chapter6.Stack;

public class BraceChecker {

    private String text;


    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char last;
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack.push(c);
                    break;
                case '}':
                    last = (char) stack.pop();
                    if (last != '{') {
                        System.err.println("Error: opend " + last + "but closed " + c + " at " + i);
                    }
                    break;
                case ']':
                    last = (char) stack.pop();
                    if (last != '[') {
                        System.err.println("Error: opend " + last + "but closed " + c + " at " + i);
                    }
                    break;
                case ')':
                    last = (char) stack.pop();
                    if (last != '(') {
                        System.err.println("Error: opend " + last + "but closed " + c + " at " + i);
                    }
                    break;
            }
        }
    }
}
