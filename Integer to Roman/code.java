class Solution {
    public String intToRoman(int num) {
        String strn=Integer.toString(num);
        int a[]=new int[strn.length()];
        for(int i=0;i<strn.length();i++)
        {
            a[i]=Integer.parseInt(String.valueOf(strn.charAt(i)));
        }
        String res="";
        if(a.length==4)
        {
            for(int i=0;i<a[0];i++)
            {
                res+="M";
            }
            if(a[1]==9)
            {
                res+="CM";
            }
            else if(a[1]==4)
            {
                res+="CD";
            }
            else if(a[1]>=5)
            {
                res+="D";
                for(int i=0;i<a[1]-5;i++)
                {
                    res+="C";
                }
            }
            else
            {
                for(int i=0;i<a[1];i++)
                {
                    res+="C";
                }
            }
            if(a[2]==9)
            {
                res+="XC";
            }
            else if(a[2]==4)
            {
                res+="XL";
            }
            else if(a[2]>=5)
            {
                res+="L";
                for(int i=0;i<a[2]-5;i++)
                {
                    res+="X";
                }
            }
            else
            {
                for(int i=0;i<a[2];i++)
                {
                    res+="X";
                }
            }
            if(a[3]==9)
            {
                res+="IX";
            }
            else if(a[3]==4)
            {
                res+="IV";
            }
            else if(a[3]>=5)
            {
                res+="V";
                for(int i=0;i<a[3]-5;i++)
                {
                    res+="I";
                }
            }
            else
            {
                for(int i=0;i<a[3];i++)
                {
                    res+="I";
                }
            }
        }
        else if(a.length==3)
        {
             if(a[0]==9)
            {
                res+="CM";
            }
            else if(a[0]==4)
            {
                res+="CD";
            }
            else if(a[0]>=5)
            {
                res+="D";
                for(int i=0;i<a[0]-5;i++)
                {
                    res+="C";
                }
            }
            else
            {
                for(int i=0;i<a[0];i++)
                {
                    res+="C";
                }
            }
            if(a[1]==9)
            {
                res+="XC";
            }
            else if(a[1]==4)
            {
                res+="XL";
            }
            else if(a[1]>=5)
            {
                res+="L";
                for(int i=0;i<a[1]-5;i++)
                {
                    res+="X";
                }
            }
            else
            {
                for(int i=0;i<a[1];i++)
                {
                    res+="X";
                }
            }
            if(a[2]==9)
            {
                res+="IX";
            }
            else if(a[2]==4)
            {
                res+="IV";
            }
            else if(a[2]>=5)
            {
                res+="V";
                for(int i=0;i<a[2]-5;i++)
                {
                    res+="I";
                }
            }
            else
            {
                for(int i=0;i<a[2];i++)
                {
                    res+="I";
                }
            }
        }
        else if(a.length==2)
        {
            if(a[0]==9)
            {
                res+="XC";
            }
            else if(a[0]==4)
            {
                res+="XL";
            }
            else if(a[0]>=5)
            {
                res+="L";
                for(int i=0;i<a[0]-5;i++)
                {
                    res+="X";
                }
            }
            else
            {
                for(int i=0;i<a[0];i++)
                {
                    res+="X";
                }
            }
            if(a[1]==9)
            {
                res+="IX";
            }
            else if(a[1]==4)
            {
                res+="IV";
            }
            else if(a[1]>=5)
            {
                res+="V";
                for(int i=0;i<a[1]-5;i++)
                {
                    res+="I";
                }
            }
            else
            {
                for(int i=0;i<a[1];i++)
                {
                    res+="I";
                }
            }
        }
        else if(a.length==1)
        {
            if(a[0]==9)
            {
                res+="IX";
            }
            else if(a[0]==4)
            {
                res+="IV";
            }
            else if(a[0]>=5)
            {
                res+="V";
                for(int i=0;i<a[0]-5;i++)
                {
                    res+="I";
                }
            }
            else
            {
                for(int i=0;i<a[0];i++)
                {
                    res+="I";
                }
            }
        }
        System.out.println(res);
        return res;
    }
}