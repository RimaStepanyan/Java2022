package bookExamples.chapter6;

public class StackDemo {
    public static void main(String[] args) {
         Stack mystack = new Stack();
         mystack.push(5);
         mystack.push(4);
         mystack.push(3);

        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
    }
}
