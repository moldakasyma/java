package lab1;

public class Data {
	private double sum;
	private double maximum;
	private int count;
	public Data() {
		
	}
	public void addData(double num) {
		sum+=num;
		if(num>maximum) {
			maximum=num;
		}
		count++;
		
	}
	public double getAverage() {
		if(count==0) {
			return 0;
		}
		
			return sum/count;	
		
	}
	public double getMaximum() {
		return maximum;
	}

}
