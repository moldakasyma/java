package lab1;



public class TempMain {

	public static void main(String[] args) {
		Temperature temp=new Temperature();
		Temperature temp2=new Temperature();
		Temperature temp3=new Temperature();
		Temperature temp4=new Temperature();
		temp.setBoth(35, 'C');
		temp2.setBoth(55, 'F');
		temp4.setValue(35);
	
		char scale=temp.getScale();
		char scale2=temp2.getScale();
		System.out.println("Temperature in Fahrenheit: "+temp.getFahrenheit()+" "+scale);
		System.out.println("Temperature in Celsius: "+temp2.getCelsius()+" "+scale2);
		System.out.println("Default temperature: "+temp3 );
		System.out.println("Default scale: "+temp4 );
		
		
		
		
		

	}

}
