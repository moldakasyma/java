package task5;

//I=I1+I2
//U=U1=U2
//1/R=1/R1+1/R2
public class Parallel extends Circuit{
	private Circuit object1;
	private Circuit object2;
	
	public Parallel(Circuit object1, Circuit object2) {
		this.object1=object1;
		this.object2=object2;
	}
	

	public double getResistance() {
		return 1.0/(1.0/object1.getResistance()+1.0/object2.getResistance());
		
	}
	
	public double getPotentialDiff() {
		return object2.getPotentialDiff();
	}
	public void applyPotentialDiff(double V) {
		object2.applyPotentialDiff(V);
		object2.applyPotentialDiff(V);
	}
	
}
