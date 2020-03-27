package JavaProgramming;

public class PalindromeNumber {
	public static void main(String[] args){
		
		int num = 123;
		int temp = num;
		int revNum=0;
		
		while(num>0){
			revNum = revNum*10 + num%10;
			num = num/10;
			
		}
		System.out.println(revNum);
		if(revNum==temp){
			
			System.out.println("Number is palindrome");
		
		}else{
			System.out.println("Its not");
		}
		
	}

}
