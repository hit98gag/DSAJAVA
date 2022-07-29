package DSA_JAVA_FROM_6TH_JULY;

public class FIndFirstPositiveMissingNumber {

	private static boolean flase;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,5,6,7,4};
		
		int max = a[0];
		
		for(int i = 1;i<a.length;i++)
		{
			if(a[i] > max) 
			{
				max = a[i];
			}
		}
			if(max<0) {
				
				System.out.println(1);
				}
		
			else {
		for(int i=1;i<=max+1;i++) {
			 
			boolean found = flase;
			for(int j=0;j<a.length;j++) {
				if(a[j] == i )
				{
					found = true;
					break;
				}
			}
				if(found == false) {
				System.out.println(i);
				break;
				}
				
			}
		}
			
		
	 }
	}


