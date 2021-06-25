
public class arr_2d_min_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{2,4,5},{3,4,7},{1,2,9}};
		
		int min = a[0][0];
		int col=0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(a[i][j]<min) {
					min = a[i][j];
				}
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(a[i][j]==min) {
					col = j;
				}
			}
		}
		
		//find max number in the column where min number is present
		
		int max = a[0][col];
		
		for(int i=0; i<3; i++) {
			if(a[i][col]>max) {
				max = a[i][col];
			}
		}
		
		//System.out.println("min number is: "+min);
		
		System.out.println("required max number: "+max);
	}

}
