package task1;

public abstract class LIbrary {
	String title;
	String author;
	int publicationYear;
	
	public LIbrary(String title,String author,int publicationYear) {
		this.title=title;
		this.author=author;
		this.publicationYear=publicationYear;
	}
	
	public abstract void LibraryItem();
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	
}
