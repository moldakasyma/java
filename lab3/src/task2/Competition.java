package task2;

public class Competition implements Swimable{
	String place;
	


	public Competition(String place) {
		this.place=place;
	
	}
	

	@Override
	public void move(double distance) {
		// TODO Auto-generated method stub
		System.out.println("You moved: "+distance);
		
	}

	@Override
	public void swim(double distance,double speed) {
		// TODO Auto-generated method stub
		System.out.println("You swimmed "+distance+" distance with "+speed+" mph");
		
	}

}
