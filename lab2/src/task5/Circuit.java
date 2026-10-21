package task5;

public abstract class Circuit {
	public abstract double getResistance();
	public abstract double getPotentialDiff();
	public abstract void applyPotentialDiff(double V);
	
	
	public double getPower() {
		double V=getPotentialDiff();
		double I=getCurrent();
		return V*I;
		
	}
	//I=V/R
	public double getCurrent() {
		double V=getPotentialDiff();
		double R=getResistance();
		return V/R;
	}
}
