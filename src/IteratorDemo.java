import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();

		a.add("Atharva");
		a.add("java");
		a.add("java");
		a.add(0, "student");
		a.add("heeee");
		a.add("sheeeee");

		HashSet<String> hs = new HashSet<String>();

		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("AUSTRAILIA");

		Iterator<String> itA = a.iterator();
		Iterator<String> itS = hs.iterator();
		
		while(itA.hasNext()) {
		System.out.println(itA.next()); 
		}
	}

}
