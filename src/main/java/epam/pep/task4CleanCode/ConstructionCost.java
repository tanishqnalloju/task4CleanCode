package epam.pep.task4CleanCode;

public class ConstructionCost {
	public static double CalculateCost(String materials, double totalAreaOfHouse, String FullyAutomatedHouseChoice) {
		if(FullyAutomatedHouseChoice.equalsIgnoreCase("No")) {
			if(materials.equalsIgnoreCase("Standard")) {
				return 1200 * totalAreaOfHouse;
			}
			else if(materials.equalsIgnoreCase("Above Standard")){
				return 1500 * totalAreaOfHouse;
			}
			else if(materials.equalsIgnoreCase("High Standard")){
				return 1800 * totalAreaOfHouse;
			}
		}
		else if (FullyAutomatedHouseChoice.equalsIgnoreCase("Yes")){
			if(materials.equalsIgnoreCase("High Standard")) {
				return 2500 * totalAreaOfHouse;
			}
		}
		
		return 0;
	}
}
