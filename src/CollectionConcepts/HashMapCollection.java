package CollectionConcepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapCollection {

	public static void main(String[] args) {
		
		HashMap<Integer, Employee> hm = new HashMap<Integer,Employee>();
		
		Employee e1 = new Employee("Dipali", 29);
		Employee e2 = new Employee("Srishti", 29);
		
		hm.put(1, e1);
		hm.put(2, e2);
		
		for(Entry<Integer, Employee> e:hm.entrySet()){
			int key = e.getKey();
			Employee emp = e.getValue();
			System.out.println(e.getKey() + " " + emp.name + " " + emp.age);
			
			
		}
		

	}

}
