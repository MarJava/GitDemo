import java.util.ArrayList;

public class arrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 //all list can accept duplicate values (set does not accept duplicate values)
		//Array list, Linked List, Vector List 
		
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Atharva");
		a.add("java");
		a.add("java");
		a.add(0, "student");
		//a.remove(1);
		//a.remove("java");
		
		System.out.println( a.get(2));
		
		System.out.println(a);
		
		System.out.println(a.contains("Atharva"));
		
		System.out.println(a.indexOf("student"));
		
		System.out.println(a.isEmpty());
		
		System.out.println(a.size());
		

	}

}
