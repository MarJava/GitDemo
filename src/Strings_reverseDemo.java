
public class Strings_reverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "radars";
		
		String b = "";
		
		for(int i=a.length()-1; i>=0; i--) {
			
			b+=a.charAt(i);
		}
		

		
		if(a.equals(b)) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
		
	}

}
