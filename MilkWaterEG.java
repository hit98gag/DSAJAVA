package DSA_JAVA_FROM_6TH_JULY;

public class MilkWaterEG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,5,0,5,3,0,5,7,0,9};
int b[] = new int[a.length];
int j=0;
		for(int i = 0 ; i<a.length;i++){
            if(a[i]>0){
                b[j] = a[i];
                    j++;
            }
        };
        for(int i=0; i<a.length;i++)
            if(a[i]==0)
            {
                b[j]=a[i];
                j++;
            }
      for (int i=0; i<b.length;i++)   {
          System.out.print(b[i] + " ");
      }
	

	}
	}
