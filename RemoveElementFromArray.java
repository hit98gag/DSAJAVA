package DSA_JAVA_FROM_6TH_JULY;

public class RemoveElementFromArray {

	public static int main(String[] args) {
		 
		int a[]= {1,4,5,6,2,1,2,1};
		int val=2;
		if(a.length==1){
            
            if(a[0] == val){
                return 0;
            }
            
            else{
                return 1;
            }
        }
        
        
        int i =0;
		int j = a.length-1;
		
		while(i<j) {
			if(a[i]!=val) {
				i++;
			}
			
			if(a[j]==val) {
				j--;
			}
			
			if(a[i]==val && a[j]!=val && i<j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				
				i++;
				j--;
			}
		}
		
		
		int count =0;
		
		for(int k=0;k<a.length;k++) {
			
			if(a[k]==val) {
				count = k;
				return count;
			}
			
		}
		
        //return count;
		return a.length;
	}

}
