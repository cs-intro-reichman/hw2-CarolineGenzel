// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	   int N=Integer.parseInt(args[0]);
	   String mode=args[1];
	   if (mode.equals("v")) {
		  for(int i=1; i<=N;i++){
	     	int counter=1;
	    	int num=i;
			boolean stop=false;
			System.out.print(num+ " ");
	    	while (!stop) {
		    	counter++;
		    	if(num%2 ==0){
			    	num/=2;
					System.out.print(num+" ");
			}
			     else {
					num=num*3+1;
					System.out.print(num +" ");}
					if (num==1) {
						stop=true;
					}
		}
	
		System.out.print("("+counter+")");
		System.out.println();
	   }
	   System.out.println("Every one of the first "+ N+ " hailstone sequences reached 1.");
	}
	   else {
		System.out.println("Every one of the first "+ N+ " hailstone sequences reached 1.");

	   }
	}
}
