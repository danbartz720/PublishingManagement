package data;

public class Book {

	private String isbn;
	private String author;
	
	public Book(String isbn){
		setIsbn(isbn);
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
