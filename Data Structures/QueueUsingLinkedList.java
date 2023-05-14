class QueueUsingLinkedList
{
    Node head;
    int Max=10;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            this.data=d;
            this.next=null;
        }
    }
    public void enqueue(int x)
    {
       Node first=new Node(x);
       first.next=head;
       head=first;
    }
    public void dequeue()
    {
        head=head.next;
    }
    public void printQueue()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
        
    }
    public void peek()
    {
        if(head==null)
        {
            System.out.println("Queue Is Empty");
        }
        else
        {
            System.out.println("Peeked Element : "+head.data);
        }
    }
    public void isFull()
    {
        int count=0;
        Node temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        if(count==Max)
        {
            System.out.println("Queue is Full");
        }
        else if(count==0)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            System.out.println("Queue has "+count+" Elements ");
        }
    }
    public void getMin()
    {
        int min=Integer.MAX_VALUE;
        Node temp=head;
        while(temp!=null)
        {
            if(min>temp.data)
            {
                min=temp.data;
            }
            temp=temp.next;
        }
        System.out.println("Min Is : "+min);
    }
     public void getMax()
    {
        int max=Integer.MIN_VALUE;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data>max)
            {
                max=temp.data;
            }
            temp=temp.next;
        }
        System.out.println("Max Is : "+max);
    }
    public static void main(String args[])
    {
        QueueUsingLinkedList Q =new QueueUsingLinkedList();
        Q.enqueue(4);
        Q.enqueue(3);
        Q.enqueue(2);
        Q.enqueue(1);
        Q.printQueue();
        Q.peek();
        Q.isFull();
        Q.getMax();
        Q.getMin();
        Q.dequeue();
        Q.printQueue();
    }
}