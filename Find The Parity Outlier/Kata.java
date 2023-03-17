import java.util.*;
public class FindOutlier
{
  static int find(int[] integers)
  {
  List<Integer>odd=new ArrayList<Integer>();
  List<Integer>even=new ArrayList<Integer>();
  for(int i:integers)
  {
    if(i%2==0)
    {
      even.add(i);
    }
    else
    {
      odd.add(i);  
    }
  }
    return even.size()==1 ? even.get(0) :odd.get(0);
  }
}

//Implementation Using Streams 

/*import java.util.*;
public class FindOutlier{
  static int find(int[] integers){
  int[] odd=Arrays.stream(integers).filter(c->c%2!=0).toArray();
  int[] even=Arrays.stream(integers).filter(c->c%2==0).toArray();  
  return odd.length==1?odd[0]:even[0];
}}*/
