//Set Demonstration with Double
package COLLECTIONDEMO;

import java.util.*;
import java.util.stream.Collectors;
public class TEST8 {
	public static void main(String[] args) {
        Set<Double> set = new HashSet<Double>();
        set.add(10.7);set.add(10.5);set.add(1.6);set.add(10.7);
        set.add(5.2);set.add(2.7);set.add(5.7);set.add(10.7);
        set.add(10.0);set.add(10.0);set.add(1.0);set.add(5.0);
        System.out.println("Printing Set");
        System.out.println(set);
        System.out.println("Printing Set with iterator");
        Iterator itr=set.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        System.out.println("Printing Set with for each");
        for(Double i:set) {
        	System.out.println(i);
        }
        Set<Double> set2 = new TreeSet<Double>();
        set2.add(10.7);set2.add(10.5);set2.add(1.6);set2.add(10.7);
        set2.add(5.2);set2.add(2.7);set2.add(5.7);set2.add(10.7);
        set2.add(10.0);set2.add(10.0);set2.add(1.0);set2.add(5.0);
        System.out.println("Printing Set2");
        System.out.println(set2);
        System.out.println("Printing Set with Stream Methods");
        System.out.println("Printing Set with Stream with forEach");
        set.stream().forEach(x->System.out.println(x));
        System.out.println("Printing Set2 with Stream with forEach");
        set2.stream().forEach(x->System.out.println(x));
        System.out.println("Printing Set with Stream with filter");
        set.stream().distinct().forEach(x->System.out.println(x));
        System.out.println("Printing Set with Stream with filter");
        System.out.println("Filtering odd");
        set.stream().filter(x->x%1==0)
                    .filter(x->x.intValue()%2 !=0)
                    .collect(Collectors.toSet())
                    .forEach(a->System.out.println(a));
        System.out.println("Filtering even");
        set.stream().filter(x->x%1==0)
                    .filter(x->x.intValue()%2==0)
                    .collect(Collectors.toSet())
                    .forEach(a->System.out.println(a));
        System.out.print("Maximum ");
        double max=set.stream().max((a,b)->Double.compare(a, b)).get();
        System.out.println(max);
        System.out.print("Minimum ");
        double min=set.stream().max((a,b)->Double.compare(b, a)).get();
        System.out.println(min);
        System.out.println("Sum, count average");
        
        double sum=set.stream().mapToDouble(Double::doubleValue).sum();
        double count=set.stream().count();
        double avg=sum/count;
        System.out.println("sum "+sum+"count "+count+"average "+avg);
	}

}
