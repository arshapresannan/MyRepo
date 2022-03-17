package egprograms;

public class PrgmFactorial {

	public static void main(String[] args) {
		
		int res=1;
		int n=5;
		for(int i=1;i<=n;i++)
		{
			res=res*i;
		}
		System.out.println("The factorial of number "+n+ " is "+res);
		}


}
