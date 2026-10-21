package task1;

public class Magazine extends LIbrary {
	String monthProduct;
	String type;
	public Magazine(String title,String author,int publicationYear,String monthProduct) {
		super(title,author,publicationYear);
		this.monthProduct=monthProduct;

	}
	
	public String getMonthProduct() {
		return monthProduct;
	}
	public String getType() {
		return type;
	}
	public void LibraryItem() {
		System.out.println("name of item: "+getTitle());
		System.out.println("year of issue: "+getPublicationYear());
		System.out.println("product of month: "+getMonthProduct());
	}
	public String toString() {
		return "name of month product: "+monthProduct;
	}
	
}
