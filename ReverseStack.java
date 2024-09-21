
package kirannew;

import java.util.Stack;

public class ReverseStack {

    // Function to reverse the stack
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        // Pop the top element
        int top = stack.pop();

        // Recursively reverse the remaining stack
        reverseStack(stack);

        // Insert the popped element at the bottom of the reversed stack
        insertAtBottom(stack, top);
    }

    // Helper function to insert an element at the bottom of the stack
    public static void insertAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }

        // Pop the top element and hold it
        int top = stack.pop();

        // Recursively insert the value at the bottom
        insertAtBottom(stack, value);

        // Push the held element back
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Add elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original Stack: " + stack);

        // Reverse the stack
        reverseStack(stack);

        System.out.println("Reversed Stack: " + stack);
    }
}

