package DSA_JAVA_FROM_6TH_JULY;

public class FindOccurenceFromFirstAndLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,10,4,6,10};
		
		int target = 10;
		int firstindex=-1;
		int lastindex=-1;
		
		for(int i=0;i<a.length;i++)
		{
			
			if (a[i]== target) {
				firstindex = i;
				break;
			}
			if (a[a.length-1-i]==target) {
				lastindex=a.length-1-i;}
		}
System.out.println(firstindex);
System.out.println(lastindex);

	}

}
