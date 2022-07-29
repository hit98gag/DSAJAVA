package DSA_JAVA_FROM_6TH_JULY;
import java.util.*;

public class Find_MaximumAndMinimum_Element_InArray {

	public static void main(String[] args) {
    
Scanner input = new Scanner(System.in);
int n = input.nextInt();
int[] a = new int[n];

for (int i=0;i<a.length;i++)
{
	a[i]= input.nextInt();
	}
		int max =a[0];
		int min = a[0];
		
		for (int i=0;i<a.length;i++) {
			
			if(a[i]>max)
			{
				max = a[i];
			}
				if(a[i]<min)
				{
					min =a[i];
				}
		
		}
		System.out.println(a.length);
	}

}

