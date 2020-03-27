package CollectionConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Dipali");
		ar.add("Kadoo");
		for (String value : ar) {

			System.out.println(value);

		}
		System.out.println();
		System.out.println("*****Using Iterator*******");
		//Using Iterator
		Iterator<String> itr = ar.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		
		//for
		for(int i = 0;i<ar.size();i++){
			
		}

	}

}
