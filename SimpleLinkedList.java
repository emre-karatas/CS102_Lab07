import java.util.Queue;

/**
 * PART C
 * @author  Emre Karatas-22001641
 * @version v1.0-30.07.2021
 */
public class SimpleLinkedList
{
    Node head;
    int counter;

    public SimpleLinkedList()
    {
        head = null;
        counter = 0;
    }

    /**
     * Adding to tail
     * @param data
     */
    public void addToTail(String data)
    {
        if ( isEmpty())
        {
            head = new Node(data,null);
        }
        else
        {
            Node temp = head;
            while (temp.getNext() != null)
            {
                temp = temp.getNext();
                temp.setIndex(counter++);
            }
            temp.setNext(new Node(data,null));
        }

    }


    /**
     * Removing from head
     * @return
     */
    public String removeFromHead()
    {
        Node temp = head;
       if( isEmpty() )
       {
           return null;
       }
       head = head.getNext();
       return temp.getData();
    }

    /**
     * isEmpty method
     * @return
     */
    public boolean isEmpty()
    {
        if( head == null)
        {
            return true;
        }
        return false;

    }

    /**
     * Getting node using data
     * @param data
     * @return
     */
    public Node get(String data)
    {
        if( isEmpty())
        {
            return null;
        }
        else
        {
            Node temp = head;
            while(temp.getNext() != null )
            {
                if ( temp.getData().equals(data))
                {
                    break;
                }
                temp = temp.getNext();
            }
            return temp;
        }
    }

    /**
     * Getting data using index
     * @param index
     * @return
     */
    public String getDataAtIndex(int index)
    {
        Node temp = head;
        while( temp != null)
        {
            if ( temp.getIndex() == index)
            {
                return temp.getData();
            }
            temp = temp.getNext();
        }
        return null;
    }

    /**
     * ToString
     * @return
     */
    public String toString()
    {
        Node temp = head;
        String output = "";
        while (temp != null)
        {
            output += temp.getData() + "  ";
            temp =temp.getNext();
        }
        return output;
    }


    public static void main(String[] args)
    {
        SimpleLinkedList list = new SimpleLinkedList();
        System.out.println("Empty? : " + list.isEmpty());
        list.addToTail("A");
        list.addToTail("B");
        list.addToTail("C");
        list.addToTail("D");
        System.out.println(list);
        System.out.println("Empty? : " + list.isEmpty());
        System.out.println("Getting 'B' index : " + list.get("B").getIndex());
        System.out.println("Getting first index's data:");
        System.out.println(list.getDataAtIndex(1));
        System.out.println("After Removing first element:");
        list.removeFromHead();
        System.out.println(list);
        System.out.println("After removing second element:");
        list.removeFromHead();
        System.out.println(list);
        System.out.println("After removing third element:");
        list.removeFromHead();
        System.out.println(list);


    }
}
