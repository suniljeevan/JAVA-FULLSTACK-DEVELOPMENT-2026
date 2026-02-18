import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

//Creating a specific list 
//it holds wrapper object or userdefined
//it is homogeneous

public class TEST3 {
	public static void main(String[] args) {
     List<Integer> specificlist = new LinkedList<Integer>();
     specificlist.add(10);
     specificlist.add(20);
     specificlist.add(7);
     specificlist.add(70);
     specificlist.add(67);
     specificlist.add(7);
     specificlist.add(17);
     specificlist.add(78);
     specificlist.add(56);
     specificlist.add(300);
     //displaying the list object all elements
     System.out.println(specificlist);
     //how to display elements only some or all
     for(Integer i:specificlist) {
    	 System.out.println(i);
     }
     //filtering the odd elements from the list
     List<Integer> oddlist=new LinkedList<Integer>();
     oddlist=specificlist.stream().filter(e->e%2!=0).
    		 collect(Collectors.toList());
     System.out.println(oddlist);
	//inserting new integer begin,end,any
     System.out.println(specificlist);
     specificlist.add(0,100);
     System.out.println(specificlist);
    // specificlist.add(11,100);
     System.out.println(specificlist);
     specificlist.add(3,100);
     System.out.println(specificlist);
     //create a list dupl_in_first to hold duplicate objects
     //to be discussed after Map
      specificlist.remove(0);
      System.out.println(specificlist);
      int index=specificlist.indexOf(100);
      System.out.println(index);
      //searching an object
      if(specificlist.contains(17)) 
    	  System.out.println("present");
      else 
    	  System.out.println("not present");
      
      System.out.println(specificlist);
      //sort is static method present in Collections class
      Collections.sort(specificlist);
      System.out.println("After sorting ");
      System.out.println(specificlist);
      List<Integer> l=new ArrayList<Integer>();
      
      
	}

}












