//8 marks
//find greatest element present in an array
//students completed-674,631,566,624,578,639,666,598,590,865,876,602
//
//587(copied)
public class TestCA1 {

	public static void main(String[] args) {
      Integer x[]= {10,23,14,25,19,17};
      int h=x[0];
      for(int i=1;i<=5;i++) {
      if(Integer.compare(h,x[i])==1)
    	  h=x[i];
      }
      System.out.println(h);
	}
	

}




