class Stack
{
    int top,max;
    int[] element;
    public Stack(int size)
    {
        this.max=size;
        this.top=-1;
        this.element=new int[size];
    }
    public void push(int x)
    {
        if(top==max-1)
        {
           System.out.println("Stack OverFlow"); 
           
        }
        else
        {
            //System.out.println("Element Pushed : "+x);
            element[++top]=x;
        }
    }
    public int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack UnderFlow"); 
            return -1;
        }
        else
        {
            //System.out.println("Element pop "+element[top]);
            return element[top--];
        }
    }
    public boolean isEmpty()
    {
        if(top==-1)
        {
            //System.out.println("Stack Is Empty");
            return true;
        }
        return false;
    }
    public void display()
    {
        for(int i : element)
        {
            System.out.print(i+"<-");
        }
        System.out.println();
    }
    public boolean balance(String str)
    {
        Stack s =new Stack(str.length());
        System.out.println(str.length()+" String : "+str);
        for(int i=0;i<str.length();i++)
        {
            char x=str.charAt(i);
            if(x=='['||x=='{'||x=='(')
            {
                s.push(x);
                System.out.println("Element Pushed "+x);
            }
            else
            {
                if(s.isEmpty() || s.top==-1)
                {
                    return false;
                }
                else if((x=='}' && s.element[s.top]=='{' || x==']' && s.element[s.top]=='[' || x==')' && s.element[s.top]=='(' ) && s.isEmpty()!=true)
                {
                    s.pop();
                    System.out.println("Element Popped "+x);
                }
                else
                {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
    public void sort(Stack input)
    {
        int size=input.top+1;
        Stack s =new Stack(size);
        while(input.isEmpty()==false)
        {
            int temp=input.pop();
            System.out.println("Element poped from input "+temp);
            while(s.isEmpty()!=true && s.element[s.top]>temp)
            {
                System.out.println("Element pushed into input "+s.element[s.top]);
                input.push(s.pop());
                input.display();
            }
            System.out.println("Element pushed into s "+temp);
            s.push(temp);
            s.display();
        }
        
         System.out.println("Finally :");
         s.display();   
         System.out.println("Maximum Value : "+s.element[s.top]);
         System.out.println("Minimum Value : "+s.element[s.max-s.top-1]);
    }
    public void reverse(Stack input)
    {
        int size=input.top+1;
        int arr[] =new int[size];
        int index=-1;
        System.out.println("Original Stack :");
        input.display();
        while(input.isEmpty()!=true)
        {
            arr[++index]=input.pop();
        }
        for(int i=0;i<size;i++)
        {
            input.push(arr[i]);
        }
        System.out.println("Reversed Stack :");
        input.display();
    
    }
    public void peek()
    {
        System.out.println("Top : "+element[top]);
    }
    public void isFull()
    {
        if(top==max-1)
        {
            System.out.println("Stack is Full");
        }
        else
        {
            System.out.println("Stack is Not Full");
        }
    }
    public static void main(String args[])
    {
        Stack s=new Stack(4);
        s.push(4);
        s.push(2);
        s.push(1);
        s.push(3);
        s.peek();
        s.isFull();
        //s.display();
        //System.out.println(s.isEmpty());
        System.out.println("Balancing Paranthesis :");
        boolean bal = s.balance("{{{}()[]");
        if(bal){ System.out.println("Balanced");}else {
            System.out.println("Not Balanced");
        }
        System.out.println();
        System.out.println("Reversing Stack Elements :");
        s.reverse(s);
        System.out.println();
        System.out.println("Sorting Stack Elements :");
        s.sort(s);
    }
}