import java.util.Scanner;
/*5. Retrieve the palindorme-true number set from given number limit and return the sum
input1:90 input2:120
logic:99+101+111
output:311                 */
public class Palindrome05 {
 public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
		  System.out.println("enter the range:");
		  int n1=s.nextInt();
		  int n2=s.nextInt();
		  int sum=0;

		  for(int i=n1;i<=n2;i++){
		   int r=0,n3=i;
		   while(n3!=0){
		    r=(r*10)+(n3%10);
		    n3=n3/10; 
		    }
		   if(r==i){
			   System.out.println(i);
		      sum=sum +i ;
		      }
		  }
 
		  System.out.println("Addition ofa Palindrome Numbers:"+sum);
		 }
 }
