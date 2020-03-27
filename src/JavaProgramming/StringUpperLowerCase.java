package JavaProgramming;

//String of A a B b C c D d. Put A B C D in one and a b c d in one
public class StringUpperLowerCase {

	public static void main(String[] args) {
		String s = "AaBbC c D d";
		String upperCase = "";
		String lowerCase = "";
		s = s.replace(" ", "");
		for(int i = 0; i<s.length();i++){
			
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch)){
				
				upperCase = upperCase + " " + ch; 
			}else{
				
				lowerCase = lowerCase + " " + ch; 
			}
		}
		
		System.out.println("Upper Case Letters are : " + upperCase);
		System.out.println("Lower Case Letters are : " + lowerCase);

	}

}
