import java.util.ArrayList;
import java.util.List;

/*19)Collect no’s frm list1 which is not present in list2 
    & Collect no’s frm list2 which is not present in list1
    and store it in output1[].
    ex: input1={1,2,3,4}; input2={1,2,3,5}; output1={4,5};    */
public class listDifferent19 {
public static void main(String[] args) {
	      ArrayList<Integer> l1=new ArrayList<Integer>();
	      l1.add(1);
	      l1.add(2);
	      l1.add(3);
	      l1.add(4);
	      System.out.println(l1);
	      ArrayList<Integer> l2=new ArrayList<Integer>();
	      l2.add(1);
	      l2.add(2);
	      l2.add(3);
	      l2.add(5);
	      System.out.println(l2);
	     
	      List<Integer> l3=new ArrayList<Integer>();
	      l3.addAll(l1);
	      List<Integer> l4=new ArrayList<Integer>();
	      l4.addAll(l2);
	      
	      l1.removeAll(l2);
	      System.out.println(l1);
	      
	      l4.removeAll(l3);
	      System.out.println(l4);
	      
	      l1.addAll(l4);
	      System.out.println(l1);
	      

}
}
