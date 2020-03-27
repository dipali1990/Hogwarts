package CollectionConcepts;

import java.util.HashMap;

//Occurrence of each character
public class OccurenceOfCharHashMap {

	public static void main(String[] args) {
		
		String s = "adgf gfjds fjsfjheh kl";
		HashMap<Character,Integer> hm = new HashMap<>();
		char[] charArray = s.toCharArray();
		for(char c : charArray){
			
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
			}
			else
				hm.put(c,1);
		}
		System.out.println(hm);
	}

}
