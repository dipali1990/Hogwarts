package test;

import static org.junit.Assert.*;

import org.junit.Test;

import JavaProgramming.BinaryToDecimal;

public class BinaryToDecimalTest {
	@Test
	  public void testGame() {
	    assertEquals(5, BinaryToDecimal.countBits(1234)); 
	    assertEquals(1, BinaryToDecimal.countBits(4)); 
	    assertEquals(3, BinaryToDecimal.countBits(7)); 
	    assertEquals(2, BinaryToDecimal.countBits(9)); 
	    assertEquals(2, BinaryToDecimal.countBits(10)); 
	  }
}
