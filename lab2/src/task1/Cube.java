package task1;

public class Cube extends Shape {
	int side;
	public Cube(int side) {
		this.side=side;
	}
	
	public double volume() {
		return (side*side*side);
	}
	public double surfaceArea() {
		return (6*side*side);	
	}
	public String getType() {
		return "Cube";
	}

}
