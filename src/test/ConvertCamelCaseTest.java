package test;

import static org.junit.Assert.*;

import org.junit.Test;

import JavaProgramming.ConvertCamelCase;

public class ConvertCamelCaseTest {
	
	@Test
    public void testSomeUnderscoreLowerStart() {
      String input = "the_Stealth_Warrior";
      System.out.println("input: "+input);      
      assertEquals("theStealthWarrior", ConvertCamelCase.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
      String input = "the-Stealth-Warrior";
      System.out.println("input: "+input);      
      assertEquals("theStealthWarrior", ConvertCamelCase.toCamelCase(input));
    }

}
