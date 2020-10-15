import java.util.ArrayList;
/*8. An arraylist of Strings is given as input. The count of the String elements that are not of size input2 string is to be returned.
input1: {"aaa","bb","cccc","d"}
input2: "bb"
output: 3("bb"-length:2)  */
public class Strings08 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
      String[] input1={"aaa","bb","cccc","d"};
      String input2="bb";
		int c=0;
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<input1.length;i++)
			list.add(input1[i]);
	     System.out.println(list);
	     
	     int n=input2.length();
	     System.out.println("Length of input2:          "+n);
	     
	     for(int i=0;i<list.size();i++){
	    	   int m=list.get(i).length();
	    	   if(n!=m)
	    	    c++;
	    	  }
	     System.out.println("Lenth of input2 is not present in input1 array is:  "+c);
	}

}
