class Book {
	private String title;
	private String author;
	private double price;

	Book(String title, String author, double price) {
	// Initialize all attributes
	
		this.title = title;
		this.author = author;
		this.price = price;
	}

	Book(String title, String author) {
	// Initialize with price = 0
	
		this.title = title;
		this.author = author;
		this.price = 0;
	
	}
}
