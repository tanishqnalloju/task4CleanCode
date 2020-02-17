/**
 * 
 */
package epam.pep.task4CleanCode;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author tanis
 *
 */
public class InterestTest {

	/**
	 * Test method for {@link epam.pep.task4CleanCode.Interest#CalculateInterest(double, double, double)}.
	 */
	@Test
	public void testCalculateInterest() {
		//fail("Not yet implemented");
		SimpleInterest SI = new SimpleInterest();
		CompundInterest CI = new CompundInterest();
		
		assertEquals(24000, SI.CalculateInterest(2000, 4, 3), 1);
		assertEquals(50800, CI.CalculateInterest(635, 2, 4), 1);
	}

}
