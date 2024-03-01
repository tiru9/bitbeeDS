package Stack;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack overflow!");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("Stack underflow!");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args){
        Stack stack = new Stack(5);
        for(int i =0; i < 5 ; i++){
            stack.push(i+1);
        }
        stack.push(6);//Pushing 6
        System.out.println("Element at Top : "+stack.peek());
        stack.pop();
        stack.pop();
        while(stack.top >= 0){
            System.out.print(" "+stack.pop());
        }
        System.out.println("Element at Top : "+stack.peek());
    }
}
