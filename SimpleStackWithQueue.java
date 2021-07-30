/**
 * PART E
 * @author  Emre Karatas-22001641
 * @version v1.0-30.07.2021
 */
public class SimpleStackWithQueue
{
    SimpleQueue q1;
    SimpleQueue q2;

    public  SimpleStackWithQueue()
    {
        q1 = new SimpleQueue();
        q2 = new SimpleQueue();
    }

    /**
     * Pushing data according to LIFO
     * @param data
     */
    public void push(String data)
    {
        q2.enqueue(data);
        while(!q1.isEmpty())
        {
            q2.enqueue(q1.dequeue());
        }
        swapNames();


    }

    /**
     * Helper method
     */
    public void swapNames()
    {
        SimpleQueue temp = q1;
        q1 = q2;
        q2 = temp;
    }


    /**
     * Popping element from stack according to LIFO
     * @return
     */
    public String pop()
    {

        return q1.dequeue();
    }

    /*
    ToString
     */
    public String toString()
    {
        Node temp = q1.linkedList.head;
        String  output = "";
        while( temp != null)
        {
            output += temp.getData() + "\n";
            temp = temp.getNext();
        }
        return output;

    }

    public static void main(String[] args)
    {
        SimpleStackWithQueue stwq = new SimpleStackWithQueue();
        System.out.println("Pushing:");
        stwq.push("a");
        stwq.push("b");
        stwq.push("c");
        System.out.println(stwq);
        System.out.println("Popping");
        stwq.pop();
        System.out.println(stwq);
        System.out.println("Popping again:");
        stwq.pop();
        System.out.println(stwq);
    }
}
