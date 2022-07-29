package DSA_JAVA_FROM_6TH_JULY;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	int a[] = {6,4,3,5,1,7,8};
	
	for(int i =1;i<a.length-1;i++)
	{
		if(a[i-1]<a[i] && a[i]> a[i+1] )
		{
			System.out.println(a[i]);
		}
		
	}
	}

}
