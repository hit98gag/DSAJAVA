package DSA_JAVA_FROM_6TH_JULY;

public class FindIFMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,1,4};
		
		int j=0;
		
		boolean isMountain = true;
		
		while(j<a.length-1 && a[j]<a[j+1]) {
			j++;
		}
			
			if(j==0 && j==a.length-1) {
				isMountain = false;
			}
         
			while (j<a.length-1 && a[j]>a[j+1]) {
				j++;
			}
			if(j!=a.length-1) {
				isMountain = false;
			}
			System.out.println(isMountain);
	}

}
