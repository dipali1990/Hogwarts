package JavaProgramming;

public class PolymorClass {

	public static void main(String[] args) {
		PolymorClass p = new PolymorClass();
		p.run(3);
		p.run("Dipali");

	}
	
	public void run(String s){
		
		System.out.println("I am in Strin");
	
	}
	
	private void run(int i){
		
		System.out.println("int");
	}

}
