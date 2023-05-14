class SumOfTwoLinkedList
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
    public void insertFirst(int d)
    {
        Node node =new Node(d);
        node.next=head;
        head=node;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public int Len()
    {
        int len=0;
        Node temp=head;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        System.out.println("Length of LinkedList : "+len);
        return len;
    }
    public void sum(Node n1 , int len1, Node n2,int len2)
    {
        Stack s =new Stack(len1+len2);
        System.out.println("Total Length of Stack :"+(len1+len2));
        Node temp1=n1,temp2=n2;
        while(temp1!=null)
        {
            s.push(temp1.data);
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            s.push(temp2.data);
            temp2=temp2.next;
        }
        int sum=0;
        for(int i=0;i<len1+len2;i++)
        {
            sum+=s.pop();
        }
        System.out.println("Sum of LinkedList 1 & 2 : "+sum);
    }
    public static void main(String args[])
    {  
        SumOfTwoLinkedList s =new SumOfTwoLinkedList();
        System.out.println("LinkedList 1 :");
        s.insertFirst(10);
        s.insertFirst(20);
        s.insertFirst(30);
        s.insertFirst(40);
        s.insertFirst(50);
        s.display();
        SumOfTwoLinkedList s1 =new SumOfTwoLinkedList();
        System.out.println("LinkedList 2 :");
        s1.insertFirst(15);
        s1.insertFirst(25);
        s1.insertFirst(35);
        s1.insertFirst(45);
        s1.insertFirst(55);
        s1.display();
        s.sum(s.head,s.Len(),s1.head,s1.Len());
    }
}