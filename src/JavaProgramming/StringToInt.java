package JavaProgramming;

//S = "2341236789543", print hi if we found divisible of 3. How to write it?

public class StringToInt {

	public static void main(String[] args) {
		String s = "320354236";
		int num = Integer.valueOf(s);
		while(num>0){
			
			int i = num%10;
			if(i%3==0){
				System.out.println("hi");
			}
			num = num/10;
			
		}

	}

}
