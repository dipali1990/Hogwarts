package JavaProgramming;

public class PersistentBugger {

	public static void main(String[] args) {
		long n=35;
		long a;
        long b = 1;
        int x = 0; 
        while (n>9){
            while(n>0){
                a = n%10;
                n = n/10;
                b = b*a;
            }
            n = b;
            b = 1;
            x++;
        }        
        System.out.println( "Your number has a multiplicative persistence of :" ) ;
        System.out.println(x);
	}

}
