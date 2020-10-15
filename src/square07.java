import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*7.  A integer input is accepted. find the square of individual digits and find their sum.
input:125
output:1*1+2*2+5*5  */
public class square07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		int sum=0;
		Iterator<Integer> itr=list.iterator();  
		while(itr.hasNext()){
			int n=(int) itr.next();
		sum=sum+(int)Math.pow(n, 2);  
		} 
		System.out.println(sum);
	}

}
