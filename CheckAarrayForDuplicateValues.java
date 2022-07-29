package DSA_JAVA_FROM_6TH_JULY;

public class CheckAarrayForDuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int a[] = {3,5,5,7,8,8,9};
		int flag=-1;
		
		for(int i=0;i<a.length-1;i++)
		
		{
			if(a[i+1]==a[0])
			{
				flag=-1;
			}
			
		}
		
			if(flag==-1)
			{
			System.out.println("yes");
			}
			
			else 
			{
             System.out.println("No");
             }
	}
}

