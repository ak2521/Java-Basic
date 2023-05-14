class LinkedList
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
    
    public void printList()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    
    public void insertFirst(int d)
    {
        Node first =new Node(d);
        first.next=head;
        head=first;
    }
    public void insertLast(int d)
    {
        Node node =new Node(d);
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node last=head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=node;
        }
    }
    public void insertMid(int d)
    {
        Node n =new Node(d);
        int count=0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        int mid=(count%2)==0 ?(count/2) :(count+1)/2;
        temp=head;
        while(mid-- >1)
        {
            temp=temp.next;
        }
        n.next=temp.next;
        temp.next=n;
        
    }
    public void InsertSpec(Node n,int d)
    {
        if(n==null)
        {
            System.out.println("Null");
        }
        else
        {
            Node node =new Node(d);
            node.next=n.next;
            n.next=node;
        }
    }
    public void reverse(int l,int r)
    {
        Stack s =new Stack(r-l+1);
        Node temp=head;
        int count=1;
        while(temp!=null)
        {
            if(count>=l && count<=r)
            {
                s.push(temp.data);
            }
            count++;
            temp=temp.next;
        }
        count=1;
        Node temp1=head;
         while(temp1!=null)
        {
            if(count>=l && count<=r)
            {
                temp1.data=s.pop();
            }
            count++;
            temp1=temp1.next;
        }
        
    }
    public void deleteFirst()
    {
        if(head!=null)
        {
            head=head.next;
        }
    }
    public void deleteByKey(int d)
    {
        Node temp=head ,prev=null;
        while(temp!=null && temp.data!=d)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }
    public void deleteLast()
    {
        Node temp=head ,prev=null;
        while(temp.next!=null)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }
    public void deleteMid()
    {
        Node slow=head;
        Node fast=head;
        Node temp=head,prev=null;
        while(fast.next!=null)
        {
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next=slow.next;
    }
    public void sortList()
    {
        Node cur=head,index=null;
        int temp;
        if(head==null)
        {
            
        }
        else
        {
            while(cur!=null)
            {
                index=cur.next;
                while(index!=null)
                {
                    if(cur.data>index.data)
                    {
                        temp=cur.data;
                        cur.data=index.data;
                        index.data=temp;
                        
                    }
                    index=index.next;
                }
                cur=cur.next;
            }
        }
    }
    public void removeDuplicates()
    {
        Node temp=head;
        int[] duplicates=new int[100];
        int index=-1;
        if(head==null)
        {
            
        }
        else
        {
            while(temp!=null)
            {
                while(temp.next!=null && temp.next.data==temp.data)
                {
                    System.out.print(temp.data+"->");
                    temp.next=temp.next.next;
                }
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        LinkedList lt =new LinkedList();
        lt.head=new Node(0);
        lt.insertFirst(2);
        lt.insertFirst(4);
        lt.insertFirst(6);
        lt.insertLast(7);
        lt.InsertSpec(lt.head.next,8);
        int left=2;
        int right=4;
        System.out.println("Before : ");
        lt.printList();
        lt.reverse(2,4);
        System.out.println("After : ");
        lt.printList();
        System.out.println("Delete First : ");
        lt.deleteFirst();
        lt.printList();
        System.out.println("Delete By Key : ");
        lt.deleteByKey(0);
        lt.printList();
        System.out.println("Delete Last : ");
        lt.deleteLast();
        lt.printList();
        System.out.println("Delete Middle : ");
        lt.deleteMid();
        lt.printList();
        System.out.println("Insert Middle : ");
        lt.insertFirst(6);
        lt.insertLast(7);
        lt.insertLast(7);
        lt.insertFirst(6);
        lt.printList();
        System.out.println("Sorted List : ");
        lt.sortList();
        lt.printList();
        System.out.println("Duplicates in the List : ");
        lt.removeDuplicates();
        lt.printList();
    }
}