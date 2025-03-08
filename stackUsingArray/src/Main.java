import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> stack = new ArrayList<>();

        //Push elements
        stack.add(10);
        stack.add(20);
        stack.add(30);


        //Current stack
        System.out.println(stack);

        //pop and print the top element;
        System.out.println(stack.get(stack.size()-1));
        stack.remove(stack.get(stack.size()-1));

        //Current stack
        System.out.println(stack);

        //peek at the top of the stack
        System.out.println("peeking at stack is: " + stack.get(stack.size()-1));

        //pop all elements in stack
        while(!stack.isEmpty()){
            System.out.println(stack.get(stack.size()-1));
            stack.remove(stack.size()-1);
        }
    }
}