package JavaProgramming;

/*In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with one side of the DNA (string, except for Haskell); you need to get the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

More similar exercise are found here http://rosalind.info/problems/list-view/ (source)

DnaStrand.makeComplement("ATTGC") // return "TAACG"

DnaStrand.makeComplement("GTAT") // return "CATA"
*/
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class DnaStrandTest {
	@Test
	public void test01() {
		assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
	}

	@Test
	public void test02() {
		assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
	}

	@Test
	public void test03() {
		assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
	}
}