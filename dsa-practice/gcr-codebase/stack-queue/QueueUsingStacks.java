import java.util.Stack;
public class QueueUsingStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Perform Enqueue operation
    void enqueue(int x){
        stack1.push(x);
        System.out.println(x + " enqueued ");
    }

    // Perform Dequeue operation
    void dequeue(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        System.out.println("Dequeued" + stack2.pop());
    }

    // Display queue
    void display(){
        System.out.println("Queue: ");

        for(int i=stack2.size()-1; i>=0; i--){
            System.out.print(stack2.get(i) + " ");
        }
        for(int i=0; i<stack1.size(); i++){
            System.out.println(stack1.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingStacks q= new QueueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();
        q.display();

        q.enqueue(40);
        q.display();

        q.dequeue();
        q.dequeue();
        q.display();
    }

    
}
