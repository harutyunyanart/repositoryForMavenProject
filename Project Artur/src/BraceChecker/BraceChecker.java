package BraceChecker;

public class BraceChecker {
    Stack myNewStack = new Stack();

    public boolean checkBrackets(String text) {
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '[':
                case '{':
                case '(':
                    myNewStack.push(text.charAt(i));
                    break;
                case ']':
                    if (myNewStack.isEmpty()) {
                        System.out.println("In the stack is not any opened bracket but user has closed "+"'"+']'+"'"+" one");
                        return false;
                    }
                    if (myNewStack.pop() != '[') {
                        System.out.println("the last element in stack is " + " " + (char) myNewStack.peek() + " " + " but should be [ in " + " " + " " + text.length() + " " + "index");
                        return false;
                    }
                    break;
                case '}':
                    if (myNewStack.isEmpty()) {
                        System.out.println("In the stack is not any opened bracket but user has closed "+"'"+'}'+"'"+" one");
                        return false;
                    }
                    if (myNewStack.pop() != '{') {
                        System.out.println("the last element in stack is " + " " + (char) myNewStack.peek() + " " + " but should be { in" + " " + text.length() + " " + "index");
                        return false;
                    }
                    break;
                case ')':
                    if (myNewStack.isEmpty()) {
                        System.out.println("In the stack is not any opened bracket but user has closed "+"'"+')'+"'"+" one");
                        return false;
                    }
                    if (myNewStack.pop() != '(') {
                        System.out.println("the last element in stack is " + " " + (char) myNewStack.peek() + " " + " but should be ( in" + " " + text.length() + " " + "index");
                        return false;
                    }
                    break;
            }
        }

        if (!myNewStack.isEmpty()) {
            System.out.println("the stack is still contains brackets!!!");
            return false;
        }
        return myNewStack.isEmpty();
    }


}


