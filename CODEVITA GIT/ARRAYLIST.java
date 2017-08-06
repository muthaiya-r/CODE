//arraylist
import java.util.*;
class Alist {

   public static void main(String args[]) {
      // create an array list
      ArrayList al = new ArrayList();
      System.out.println("Initial size of al: " + al.size());

      // add elements to the array list
      al.add("C");
      al.add("A");
      al.add("E");
      al.add("B");
      al.add("D");
      al.add("F");
      al.add(1, "A2");
      System.out.println("Size of al after additions: " + al.size());

      // display the array list
      System.out.println("Contents of al: " + al);

    int a= nevin.size();
	if(a==7)
	{
	 System.out.println("yes");
	}
	al.clear();
	
	System.out.println("Size : " + al.size());
   }
}