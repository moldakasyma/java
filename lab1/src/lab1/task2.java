package lab1;



public class task2 {
	
	private final String name;
	Genre genre;
	private final int year;
	private static int ticketSales;
	
	static {
		ticketSales=0;
	}
	{
		ticketSales++;
	}
	public task2(String name, int year) {
		this.name=name;
		this.year = year;
	}
	public task2(String name,int year,Genre genre) {
		this(name,year);
		this.genre=genre;
	}
	
	public static void cinema(String name) {
		System.out.println("Movie name: "+ name);
		
	}
	
	public static void cinema(String name, int year) {
		System.out.println("Movie name: "+ name+" "+"Year: "+year);
	}
	
	
	
	public static void cinema(String name,Genre genre) {
		System.out.println("Movie name:" +name+" "+"Movie genre: "+genre);
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	public Genre getGenre() {
		return genre;
	}
	public int getTicketCount() {
		return ticketSales;
	}
	
	
	

	
	
}
