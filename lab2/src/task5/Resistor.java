package task5;

public class Resistor extends Circuit {
	private double resistance;
	private double potentialDifference;
	
	public Resistor(double resistance) {
		this.resistance=resistance;
	}
	public double getResistance() {
		return resistance;
	}
	
	public double getPotentialDiff() {
		return potentialDifference;
	}
	
	public void setPotentialDiff(double potentialDifference) {
	
		this.potentialDifference=potentialDifference;
	}

	
	public void applyPotentialDiff(double V) {
		potentialDifference=V;
	}
	
	
	public double tostring() {
		return getResistance();
	}
}
