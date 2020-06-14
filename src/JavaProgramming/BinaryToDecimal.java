package JavaProgramming;

public class BinaryToDecimal {
	public static int countBits(int n){
		
		// array to store binary number 
        int[] binaryNum = new int[1000]; 
        int result = 0;
   
        // counter for binary array 
        int i = 0; 
        while (n > 0)  
        { 
            // storing remainder in binary array 
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
   
        // printing binary array in reverse order 
        for (int j = i - 1; j >= 0; j--) 
        	result = result*10+ binaryNum[j];
        return result;
	}
	
	

}
