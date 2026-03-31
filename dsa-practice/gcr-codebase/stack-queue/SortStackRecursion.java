import java.util.Stack;
public class SortStackRecursion {

    // Sort the stack
    static void sortStack(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int temp = stack.pop();
            sortStack(stack);
            insertSorted(stack,temp);
        }
    }

    // Insert element in sorted order
    static void insertSorted(Stack<Integer> stack, int value){
        if(stack.isEmpty() || stack.peek() <=value){
            stack.push(value);
            return;
        }
        int temp = stack.pop();
        insertSorted(stack, value);
        stack.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Insert elements 
        stack.push(30);
        stack.push(10);
        stack.push(20);
        stack.push(40);
        // print stack
        System.out.println("Original Stack: " + stack);
        // print sorted stack
        sortStack(stack);
        System.out.println("Sorted Stack: " + stack);

    }
    
}
