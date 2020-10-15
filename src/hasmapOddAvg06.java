import java.util.HashMap;
import java.util.Iterator;
/*6. HashMap with regnum as key and mark as value. find the avg of marks whose key is odd.
input:{12:90,35:90,33:90,56:88}
output:avg of(90+90) =90               */
public class hasmapOddAvg06 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
		map.put(12, 90);
		map.put(35, 90);
		map.put(33, 90);
		map.put(56, 88);
		int sum=0;
		Iterator<Integer> i=map.keySet().iterator();
		   while(i.hasNext()){
			      int n=i.next();
			      System.out.println(n);
			      int k=map.get(n);
			      if(n%2!=0){
			    	 sum=sum+k;
			    }
		   }
    System.out.println("Avg of marks whose key is odd :     "+sum/2);
	}

}
