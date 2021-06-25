
public class pyramids1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int x=3;
		int k=1;
		
		for(int i=1; i<=10; i++) {
			for(int j=x; j>=0; j--) {
				System.out.print(k+" ");
				k++;
			}
			
			System.out.println();
			x--;
			
		} */
		
		//optimised code for above code
		
		int k=1;
		
		for(int i=0; i<=3; i++) {
			for(int j=1;j<=4-i; j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		
	}

}
