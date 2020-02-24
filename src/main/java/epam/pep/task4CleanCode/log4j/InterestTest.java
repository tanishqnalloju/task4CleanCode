/**
 * 
 */
package epam.pep.task4CleanCode.log4j;

//import static org.junit.Assert.*;

//import org.junit.Test;

import epam.pep.task4CleanCode.CompundInterest;
//import epam.pep.task4CleanCode.Interest;
import epam.pep.task4CleanCode.SimpleInterest;

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

public class InterestTest {

	/**
	 * Test method for {@link epam.pep.task4CleanCode.Interest#CalculateInterest(double, double, double)}.
	 */
	
	private static final Logger logger = LogManager.getLogger(ConstructionCostTest.class);
	
	//@Test
	@SuppressWarnings("deprecation")
	public static void main(String[] args) { //testCalculateInterest() {
		//fail("Not yet implemented");
		logger.entry();
		logger.trace("Testing");
		logger.debug("Testing Interest modules");
		SimpleInterest SI = new SimpleInterest();
		CompundInterest CI = new CompundInterest();
		
		logger.info(SI.CalculateInterest(2000, 4, 3));
		//assertEquals(24000, SI.CalculateInterest(2000, 4, 3), 1);
		logger.info(CI.CalculateInterest(635, 2, 4));
		//assertEquals(50800, CI.CalculateInterest(635, 2, 4), 1);
		logger.exit();
	}

}
