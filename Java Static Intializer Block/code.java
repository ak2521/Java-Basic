static boolean flag=true;
static int B;
static int H;
static
{
    Scanner sc=new Scanner(System.in);
    B=sc.nextInt();
    H=sc.nextInt();
    try{
        if(B<=0 || H<=0)
        {
            flag=false;
            throw new Exception();
        }
    }
    catch(Exception e)
    {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}

