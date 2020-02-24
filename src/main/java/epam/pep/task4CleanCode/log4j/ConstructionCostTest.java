/**
 * 
 */
package epam.pep.task4CleanCode.log4j;

//import static org.junit.Assert.*;

//import org.junit.Test;

import epam.pep.task4CleanCode.ConstructionCost;

//Importing log4j classes.
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * @author tanis
 *
 */

/**
 * Log4j logger
 */


public class ConstructionCostTest {

	/**
	 * Test method for {@link epam.pep.task4CleanCode.ConstructionCost#CalculateCost(java.lang.String, double, java.lang.String)}.
	 */
	
	private static final Logger logger = LogManager.getLogger(ConstructionCostTest.class);
	
	//@Test
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {//testCalculateCost() {
		//fail("Not yet implemented");
		logger.entry();
		logger.trace("Testing");
		
		logger.debug("Testing Construction Cost");
		logger.info(ConstructionCost.CalculateCost("standard", 400, "NO"));
		//assertEquals(480000, ConstructionCost.CalculateCost("standard", 400, "NO"), 1);
		//logger.info(assertEquals(480000, ConstructionCost.CalculateCost("standard", 400, "NO"), 1));
		logger.info(ConstructionCost.CalculateCost("High standard", 2000, "yes"));
		//assertEquals(5000000, ConstructionCost.CalculateCost("High standard", 2000, "yes"), 1);
		
		logger.exit();
	}

}
