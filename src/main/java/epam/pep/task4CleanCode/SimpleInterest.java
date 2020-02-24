package epam.pep.task4CleanCode;

public class SimpleInterest extends Interest{

	@Override
	public
	double CalculateInterest(double principal, double rate, double time) {
		// TODO Auto-generated method stub
		return principal * rate * time;
	}
	
}
