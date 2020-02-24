package epam.pep.task4CleanCode;

import java.lang.Math;

public class CompundInterest extends Interest{

	@Override
	public
	double CalculateInterest(double principal, double rate, double time) {
		// TODO Auto-generated method stub
		return principal * Math.pow(rate + 1, time) - principal;
	}
	
}
