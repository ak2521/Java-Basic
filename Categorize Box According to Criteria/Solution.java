class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        double val = Math.pow(10, 4);
        String b="",h="";
        if(mass>=100)
        {
            h="Heavy";
        }
        if(length >= val || width >= val || height >= val )
        {
            b="Bulky";
        }
        else if((long)length*width*height >= Math.pow(10,9))
        {
           b="Bulky";  
        }
        if(b.equals("Bulky") && h.equals("Heavy"))
        {
            return "Both";
        }
        else if(!b.equals("Bulky") && !h.equals("Heavy"))
        {
            return "Neither";
        }
        else if(b.equals("Bulky") && !h.equals("Heavy"))
        {
            return "Bulky";
        }
        else
        {
        return "Heavy";
        }
    }
}
