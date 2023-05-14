class StackUsingLinkedList
{
    Node head;
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
    public void push(int x)
    {
        Node n =new Node(x);
        if(head==null)
        {
            head=n;
        }
        else
        {
            Node last =head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=n;
        }
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"<-");
            temp=temp.next;
        }
        System.out.println();
    }
    public void peek()
    {
        int last=0;
        Node temp=head;
        while(temp!=null)
        {
            last=temp.data;
            temp=temp.next;
        }
        System.out.println("Top Is : "+last);
    }
    public void pop()
    {
     int last=0;
     Node temp=head,prev=null;
     while(temp.next!=null)
     {
         prev=temp;
         temp=temp.next;
         last=temp.data;
     }
        System.out.println("Poped Element : "+last);
        prev.next=temp.next;
    }
    public void isEmpty()
    {
        if(head==null)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println("Stack is Not Empty");
        }
    }
    public static void main(String args[])
    {
        StackUsingLinkedList s =new StackUsingLinkedList();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.display();
        s.peek();
        s.pop();
        s.display();
        s.isEmpty();
    }
        
}