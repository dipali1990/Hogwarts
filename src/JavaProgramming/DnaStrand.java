package JavaProgramming;
public class DnaStrand {
  public static String makeComplement(String dna) {
	  
	  String comp = "";
	  
	  for(int i=0; i<dna.length();i++){
		  
		  char c = dna.charAt(i);
		  if(c =='A'){
			  
			  c='T';
		  }else if(c == 'T'){
			  c = 'A';
		  }else if(c == 'C'){
			  c='G';
		  }else{
			  c = 'C';
		  }
		  comp = comp + c;
		  
	  }
    return comp;
    
    
    /* Optimized method
     * 
     * char[] chars = dna.toCharArray();
    for(int i = 0; i < chars.length; i++) {
      chars[i] = getComplement(chars[i]);
    }
    
    return new String(chars);
  }
  
  private static char getComplement(char c) {
    switch(c) {
      case 'A': return 'T';
      case 'T': return 'A';
      case 'C': return 'G';
      case 'G': return 'C';
    }
    return c;
  }
     * 
     */
    
  }
}