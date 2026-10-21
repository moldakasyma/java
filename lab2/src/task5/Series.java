package task5;
//I=I1=I2
//U=U1+U2
//R=R1+R2

public class Series extends Circuit{
	private Circuit object1;
	private Circuit object2;
	public Series(Circuit object1,  Circuit object2) {
		this.object1=object1;
		this.object2=object2;
	}



	public double getResistance() {
		return object1.getResistance()+object2.getResistance();
	}
	
	public double getPotentialDiff() {
		return object1.getPotentialDiff()+object2.getPotentialDiff();
	}
	
	public void applyPotentialDiff(double V) {
		double totalResistance=getResistance();
		double totalCurrent=V/totalResistance;
		double V1=totalCurrent*object1.getResistance();
		double V2=totalCurrent*object2.getResistance();
		object1.applyPotentialDiff(V1);
		object2.applyPotentialDiff(V2);
		
		
	}

}
