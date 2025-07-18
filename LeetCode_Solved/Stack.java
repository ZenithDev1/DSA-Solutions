public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // stack is empty
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
  
    public static void main(String[] args) {
        Stack myStack = new Stack(5);

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println("Top element is: " + myStack.peek());

        System.out.println("Popped: " + myStack.pop());
        System.out.println("Popped: " + myStack.pop());

        myStack.push(40);
        myStack.push(50);
        myStack.push(60);
        myStack.push(70); 
    }
}
