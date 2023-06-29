package Clazzes;

public class Bracket {

    Stack myStack = new Stack();

    public boolean checkBrackets(String text) {
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '[':
                case '{':
                case '(':
                    myStack.push(text.charAt(i));
                    break;
                case ']':
                    if (myStack.isEmpty()) {
                        System.out.println("the stack is empty");
                        return false;
                    }
                    if (myStack.pop() != '[') {
                        System.out.println("the last element in stack is " + " " + (char) myStack.peek() + " " + " but should be [ in " + " " + " " + text.length() + " " + "index");
                        return false;
                    }
                    break;
                case '}':
                    if (myStack.isEmpty()) {
                        System.out.println("the stack is empty");
                        return false;
                    }
                    if (myStack.pop() != '{') {
                        System.out.println("the last element in stack is " + " " + (char) myStack.peek() + " " + " but should be { in" + " " + text.length() + " " + "index");
                        return false;
                    }
                    break;
                case ')':
                    if (myStack.isEmpty()) {
                        System.out.println("the stack is empty");
                        return false;
                    }
                    if (myStack.pop() != '(') {
                        System.out.println("the last element in stack is " + " " + (char) myStack.peek() + " " + " but should be ( in" + " " + text.length() + " " + "index");
                        return false;
                    }
                    break;
            }
        }

        if (!myStack.isEmpty()) {
            System.out.println("the stack is still contains brackets!!!");
            return false;
        }
        return myStack.isEmpty();
    }


}
