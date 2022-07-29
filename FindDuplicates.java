package DSA_JAVA_FROM_6TH_JULY;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,4,5,6,6,7,7};
	      int num = 0 ; 
		for(int i = 0; i<a.length;i++)
			
			
		{
			if(a[i]== a[i+1])
			{
				 num = a[i];
					System.out.println(num);

			}
		}


	}

}
