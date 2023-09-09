class Solution {
    public List<String> cellsInRange(String s) {
        String numb1="";
        numb1+=s.charAt(1);
        List <String> res=new ArrayList<String>();
        int n1=Integer.parseInt(numb1);
        String numb2="";
        numb2+=s.charAt(4);
        int n2=Integer.parseInt(numb2);
        int one=(int)s.charAt(0);
        int two=(int)s.charAt(3);
        //System.out.println("n1 "+n1+" n2 "+n2+" one "+one+" two "+two);
        for(int i=one;i<=two;i++)
        {
            char ch1=(char)i;
            //System.out.println(ch1);
            for(int j=n1;j<=n2;j++)
            {
                char ch2=(char)(j+'0');
                //System.out.println(ch2);
                String su="";
                su+=ch1;
                su+=ch2;
                //System.out.println(su);
                res.add(su);
            }
        }
        return res;
    }
}