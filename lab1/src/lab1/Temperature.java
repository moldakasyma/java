package lab1;

public class Temperature {
	private double tempValue;
	private char scale;
	public Temperature(char scale) {
		this.tempValue=0.0;
		this.scale=scale;
	}
	public Temperature(double tempValue) {
		this.tempValue=tempValue;
		this.scale='C';
	}
	public Temperature(double tempValue,char scale) {
		this.tempValue=tempValue;
		this.scale=scale;
		
		
	}
	public Temperature() {
		this.tempValue=0.0;
		this.scale='C';
	}
	public double getCelsius() {
		if(scale=='C') {
			return tempValue;
			
		}
		return (tempValue-32)*5/9;
	}
	public double getFahrenheit() {
		if(scale=='F') {
			return tempValue;
		}
		return (9*(tempValue/5))+32;
	
	}
	
	public void setValue(double value) {
		this.tempValue=value;
	}
	
	public void setScale(char scale) {
		if (scale=='F'|| scale=='C') {
		this.scale=scale;
	}
	}
	public void setBoth(double value,char scale) {
		this.tempValue=value;
		this.scale=scale;
	}
	
	public char getScale() {
		if(scale=='F') {
			return 'C';
		}
		
		return 'F';
	}
	public String toString() {
		return tempValue+" "+scale;
	}
	
	
	
	
		
		
	

}
