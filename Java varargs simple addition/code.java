class Add
{
    void add(int... a)
    {
        int sum=0;
        for(int i:a)
        {
            sum+=i;
        }
        String str="";
        for(int i:a)
        {
            str+=Integer.toString(i)+"+";
        }
        String strres=str.substring(0,str.length()-1);
        strres+="="+Integer.toString(sum);
        System.out.println(strres);
    }
}


