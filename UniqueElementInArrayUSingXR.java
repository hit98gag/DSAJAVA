package DSA_JAVA_FROM_6TH_JULY;

public class UniqueElementInArrayUSingXR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr={7,3,5,4,5,3,4};
		
		int x =0;
		for(int i=0;i<arr.length;i++)
		{
		    x= x^arr[i];
		}
		System.out.println(x);
	}
	}

