import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/*4.Two inputs of a string array and a string is received. The array shld be sorted in descending order. The index of second input 
 * in a array shld be retrieved.
input1:{"ga","yb","awe"}
input2:awe
output:2                        */
public class arrays04 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input1={"ga","yb","awe"};
		String input2="awe";
		ArrayList<String> list=new ArrayList<String>();
	    for(int i=0;i<input1.length;i++)
			list.add(input1[i]);
		System.out.println("Given Input"+list);
		Collections.sort(list);
		System.out.println("Sorting Input"+list);
		Collections.reverse(list);
		//Collections.sort(list,Collections.reverseOrder());
		System.out.println("Reverse Order"+list);
		
		int n=list.indexOf(input2);
		System.out.println(n);

	}

}
