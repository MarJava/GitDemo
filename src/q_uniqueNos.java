import java.util.ArrayList;

public class q_uniqueNos {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		/*
		 * Output will be like:
		 * 		4 is present 3 times
		 * 		5 is present 3 times
		 * 		6 is present 2 times
		 * 		9 is present 1 time
		 */
		
		int a[] = {4,5,5,5,4,6,6,9,4};
		
		ArrayList<Integer> a1 = new ArrayList<Integer>(); 
		
		for(int i=0; i<a.length; i++) 
		{
			if(!a1.contains(a[i])) {
				a1.add(a[i]);
			}
			
		}
		
		int fq[] = new int[a1.size()];
		
		for(int i=0; i<fq.length; i++) {
			fq[i] = 0;
		}
		
		for(int i=0; i<a1.size(); i++) {
			for(int j=0; j<a.length; j++)  {
				if(a1.get(i)==a[j]) {
					fq[i]++;
				}
			}
		}
		
		for(int i=0; i<a1.size(); i++) {
			System.out.println(a1.get(i)+" is present "+fq[i]+" time");
		}
		
		//System.out.println(a1);
		
	}
	
}