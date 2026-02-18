//Test Stream with primitive object
// create a list of integers
// to test various stream methods.
import java.util.*;
import java.util.stream.Collectors;
public class TEST9 {
	public static void main(String[] args) {
      List<Integer> list=new ArrayList<>();
      list.add(10);
      list.add(10);
      list.add(0,12);
      list.addLast(100);
      list.add(125);
      list.add(25);
      // print the objects of list using toString()
      System.out.println(list);
      // print objects one at a time
      // use forEach
      System.out.println("using forEach");
      for(Integer x:list) {
    	  System.out.println(x);
      }
      System.out.println("using for loop");
      for(int i=0;i<list.size();i++) {
    	  System.out.println(list.get(i));
      }
      System.out.println("using Iterator");
     Iterator itr= list.listIterator(); 
      while(itr.hasNext()) {
    	  System.out.println(itr.next());
      }
      // Searching (Binary Search)
      if(list.contains(20))
    	  System.out.println("Object 20 found");
      else
    	  System.out.println("Not found");
      // sorting 
      Collections.sort(list);	  
      System.out.println("After sorting "+list);
      // remove an object from a location
      list.remove(3);// removes 4th element
      System.out.println(list);
      // remove an object 10
      list.remove(new Integer(10));
      System.out.println("After removal "+list);
      list.stream().map(x->x%2)
                   .collect(Collectors.toList())
                   .forEach(x->System.out.println(x));
      // map the above list 
      // list of booleans 
      // if > 100 false
      List<Boolean> result=
    		      list.stream().map(x->x<100)
                   .collect(Collectors.toList());
      for(Boolean r:result) {
    	  System.out.println(r);
      }
      // filter all integer odd objects
      List<Integer> odd=
    		  list.stream().filter(x->x%2!=0)
                   .collect(Collectors.toList());
      System.out.println("odd list "+odd);
      list.stream().filter(x->x%2!=0)
                   .collect(Collectors.toList())
                   .forEach(x->System.out.println(x));
      System.out.print("Largest: ");
      int g=list.stream()
   		   .max((a,b)->Integer.compare(a,b))
   		   .get();
      System.out.println("Largest is "+g);
      int s=list.stream()
    		  .min((x,y)->Integer.compare(x, y))
    		  .get();
      System.out.println("Smallest is "+s);
      
      // Find avg of all numbers
      int sum= list.stream().
    		  mapToInt(Integer::intValue)
              .sum();
         System.out.println("sum is "+s);
      double avg=(double)sum/list.stream().count();
         System.out.println("Count "+
                    list.stream().count());
         System.out.println("average "+avg);
      
      
      
      
      
      
	}

}



