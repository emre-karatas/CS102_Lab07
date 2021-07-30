
/**
 * PART D
 * @author  Emre Karatas-22001641
 * @version v1.0-30.07.2021
 */
public class SimpleQueue
{
    SimpleLinkedList linkedList;

    public SimpleQueue()
    {
       linkedList = new SimpleLinkedList();
    }

    /**
     * Adding according to FIFO
     * @param data
     */
    public void enqueue(String data)
    {
        if ( isEmpty())
        {
            linkedList.head = new Node(data,null);
        }
        else
        {
            Node temp = linkedList.head;
            while (temp.getNext() != null)
            {
                temp = temp.getNext();
            }
            temp.setNext(new Node(data,null));
        }
    }

    /**
     * Removing according to FIFO
     * @return
     */
    public String dequeue()
    {
        if( isEmpty())
        {
            return null;
        }
        return linkedList.removeFromHead();

    }

    /**
     * isEmpty
     * @return
     */
    public boolean isEmpty()
    {
        if( linkedList.head == null)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        SimpleQueue queue = new SimpleQueue();

        System.out.println(queue.isEmpty());
        System.out.println("Enqueue:");
        queue.enqueue("1");
        queue.enqueue("3");
        queue.enqueue("5");
        System.out.println(queue.linkedList);
        System.out.println("is empty? " + queue.isEmpty());
        System.out.println("Dequeue:");
        queue.dequeue();
        System.out.println(queue.linkedList);
        System.out.println("Dequeue again:");
        queue.dequeue();
        System.out.println(queue.linkedList);

    }


}
