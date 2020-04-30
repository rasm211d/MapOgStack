import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //instanciere en stack
        Stack<String> stack = new Stack<>();

        //tilføjer til stack
        stack.push("hej");

        //se første element i stacken uden at "poppe" det, altså fjerne det
        System.out.println("nu peeker jeg: " + stack.peek());

        //fjerner øverste element.
        String topElement = stack.pop();
        System.out.println("nu popper jeg: " + topElement);

        stack.push("1");
        stack.push("2");
        stack.push("3");

        //Man kan søge
        int index = stack.search("1");
        System.out.println("på dette index finder du tallet 1: " + index);

        //iterere
        Iterator iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
