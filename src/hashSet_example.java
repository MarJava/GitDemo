import java.util.HashSet;

public class hashSet_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//does not accept duplicate values
		//there is no gurantee that elements are added in sequential order
		//they may be store in random order

		HashSet<String> hs = new HashSet<String>();
		
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("INDIA");
		
		hs.remove("UK");
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		System.out.println(hs);
		
		
	}

}
