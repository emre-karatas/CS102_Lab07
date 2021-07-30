/**
 * PART B
 * @author  Emre Karatas-22001641
 * @version v1.0-30.07.2021
 */
public class Node
{
    private String data;
    private Node next;
    private int index = 0;

    public Node(String data, Node next)
    {
        this.data = data;
        this.next = next;

    }

    public Node(String data)
    {
        this.data = data;
        next= null;

    }

    public void setData(String data)
    {
        this.data = data;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

    public String getData()
    {
        return data;
    }

    public Node getNext()
    {
        return next;

    }

    public void setIndex(int index)
    {
        this.index = index;
    }


    public int getIndex()
    {
        return index;
    }


}
