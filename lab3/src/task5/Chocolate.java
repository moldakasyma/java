package task5;
import java.util.Objects;
public class Chocolate implements Comparable<Chocolate> {
	double weight;
	String name;
	public Chocolate() {
		
	}
	public Chocolate(double weight,String name) {
		this.weight=weight;
		this.name=name;
	}

	@Override
	public int compareTo(Chocolate o) {
		// TODO Auto-generated method stub
		Chocolate ch=(Chocolate)o;
		
		if(this.weight>ch.weight) {
			return 1;
		}
		if(this.weight<ch.weight) {
			return 1;
		}
		return 0;
	}
	public String toString() {
		return "name: "+name+" "+"weight: "+weight;
	}
	

}
