import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*24)input1 is a map<Integer,Float>
    {1:2.3,2:5.6,3:7.7,4:8.4}
    get the even number from keys and find the avg of values of these keys.
    answer should be rounded to two numbers after decimal
    eg:- the output number 15.2499999 should be 15.25            */
public class IntegerMap24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Float> m1=new HashMap<Integer,Float>(); 
		m1.put(1,  2.3f);
		m1.put(2, 5.6f);
		m1.put(3, 7.7777777777f);
		m1.put(4, 8.4f);
		
		Float f=0f;
		for(Entry<Integer, Float> m:m1.entrySet()){  
			   System.out.println(" "+m.getValue()); 
			   f=m.getValue()+f;
			   
			  } 
		System.out.println("Addition of all the float Values:     "+f);
		Float f1=(float) Math.round(f*100)/100f;
		System.out.println(f1);
		

	}

}
