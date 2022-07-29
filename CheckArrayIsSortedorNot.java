package DSA_JAVA_FROM_6TH_JULY;

public class CheckArrayIsSortedorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 boolean Sorted = true;
		 int a[] = {1,3,7,9,15,3,2,5,7};
		 
		 for(int i =0;i<a.length;i++)
		 {
			 if(a[i]>a[i+1])
			 {
				 Sorted =  false;
				 break;
			 }
			 
			 
				 
			 }
		 System.out.println(Sorted);

		 }

	}


