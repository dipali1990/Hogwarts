package JavaProgramming;

public class ConvertCamelCase {

	public static String toCamelCase(String s) {
		String result = "";
		String regex = "[-,_]";
		String[] words = s.split(regex );
		for(int i=1;i<words.length;i++){
			char[] letters = words[i].toCharArray();
			char firstLetter = Character.toUpperCase(letters[0]);
			String camelWord = firstLetter + words[i].substring(1);
			
			result = result+camelWord;
			
		}
		//s = s.replaceAll(regex, "");
		result = words[0]+result;
		return result;
		
		
		/* String[] words = s.split("[_\\-]");
		    s=words[0];
		    for(int i=1; i<words.length; i++)
		      s+=words[i].substring(0,1).toUpperCase()+words[i].substring(1).toLowerCase();
		    return s;*/
	
	}

}
