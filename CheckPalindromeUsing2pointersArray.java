package DSA_JAVA_FROM_6TH_JULY;

public class CheckPalindromeUsing2pointersArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,3,2,1};
		int i = 0;
		int j =a.length-1;
		
		
		boolean flag= true;
		while(i<j)
		{
			if(a[i]==a[j])
			{
				i++;
				j--;
			}
			else {
				flag = false;
				break;
			}
			
		}
		System.out.println(flag);
	}

}
