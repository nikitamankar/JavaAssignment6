import java.util.ArrayList;
import java.util.StringTokenizer;

/*20) input-- String input1="AAA/abb/CCC"
    char input2='/'
    output-- String[] output1;
    output1[]={"aaa","bba","ccc"};

    operation-- get the strings from input1  using stringtokenizer
                reverse each string
                then to lower case
                finally store it in output1[] string array          */
public class StringReverse20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1="AAA/abb/CCC";
		
		ArrayList<String> l=new ArrayList<String>();
		StringTokenizer t=new StringTokenizer(input1,"/");
		while(t.hasMoreTokens()){
			StringBuffer sb=new StringBuffer(t.nextToken().toLowerCase());
			l.add(sb.reverse().toString());
			}
		String op[]=new String[l.size()];
			for(int i=0;i<op.length;i++)
				op[i]=l.get(i);
			
			for(String s:op)
				System.out.println(s);
		


	
		
		
	}

}
