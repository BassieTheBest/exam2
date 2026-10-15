package problem1;

public class Book {
	private String author;
	private String title;
	private double price;
	
	public Book() {
		this.setAuthor("Unknown");
		this.setTitle("Unknown");
		this.setPrice(0);
	}
	public Book(String author, String title, double price) {
		this.setAuthor(author);
		this.setTitle(title);
		this.setPrice(price);
	}
	
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if (price >= 0 && price <= 200) {
			this.price = price;
		}
		else {
			this.price = price;
		}
		
	}
	
	public void show() {
		System.out.printf("%s by %s for $%s\n", title, author, price);
	}
	
	
}
