import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/*22)HashMap<String,Integer> h1={�abc�:50,�efg�:70};
    if the mark is less than 60 then put the output in the
    HashMap<String,String> h2={�abc�:�fail�,�efg�:�pass�}      */
public class hashmapPassFail22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("abc", 50);
		map.put("efg", 70);
		
		
		for(Entry<String, Integer> m:map.entrySet()){  
			  // System.out.println(" "+m.getValue());
			   if(m.getValue()<60)
				   System.out.print(m.getKey()+" : " +"fail  ");
			   else
				   System.out.print(m.getKey()+" : "+"pass");
			  } 
	}

}
