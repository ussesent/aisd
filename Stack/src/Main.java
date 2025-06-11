public class Main {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();

        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println("Size: " + stack.size()); // 3
        System.out.println("Top element: " + stack.peek()); // Third

        System.out.println("Popped: " + stack.pop()); // Third
        System.out.println("Popped: " + stack.pop()); // Second

        System.out.println("Size after pops: " + stack.size()); // 1
        System.out.println("Is empty? " + stack.isEmpty()); // false
    }
}