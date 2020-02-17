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
public class ConstructionCostTest {

	/**
	 * Test method for {@link epam.pep.task4CleanCode.ConstructionCost#CalculateCost(java.lang.String, double, java.lang.String)}.
	 */
	
	@Test
	public void testCalculateCost() {
		//fail("Not yet implemented");
		assertEquals(480000, ConstructionCost.CalculateCost("standard", 400, "NO"), 1);
		assertEquals(5000000, ConstructionCost.CalculateCost("High standard", 2000, "yes"), 1);
		
	}

}
