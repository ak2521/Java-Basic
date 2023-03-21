class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9)
        {
            digits[digits.length-1]++;
            return digits;
        }
        else
        {
            int j=0;
            int flag=0;
            for(int i=0;i<digits.length;i++)
            {
                if(digits[i]==9)
                {
                    flag=1;
                }
                else
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
            int ndigits[]=new int[digits.length+1];
            for(int i=0;i<ndigits.length;i++)
            {
                ndigits[i]=0;
            }
            for(int i=0;i<digits.length;i++)
            {
                if(digits[i]==9)
                {
                    ndigits[i]+=1;
                    break;
                }
                else
                {
                    ndigits[i]=digits[i];
                }
            }
            return ndigits;
            }
            else
            {
                int pos;
                for(pos=digits.length-1;pos>=0;pos--)
                {
                    if(digits[pos]!=9)
                    {
                        break;
                    }
                }
                digits[pos]++;
                for(int i=pos+1;i<digits.length;i++)
                {
                    digits[i]=0;
                }
                return digits;
            }
        }
    }
}