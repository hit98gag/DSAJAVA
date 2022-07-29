package DSA_JAVA_FROM_6TH_JULY;

public class SumOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =1234;
		int sum = 0;
		int c =0;
		
		while(n>0)
		{
			c = n%10; //4 

			n=n/10;  // 123
			sum = sum+c;

		}
		System.out.println(sum);
	}

}
