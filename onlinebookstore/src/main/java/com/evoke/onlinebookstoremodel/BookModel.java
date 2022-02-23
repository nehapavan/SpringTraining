package com.evoke.onlinebookstoremodel;

public class BookModel {
	private String BookId;
	private String BookName;
	private String Author;
	private String title;
	private String Price;

	public BookModel() {
		super();
	}

	public BookModel(String bookId, String bookName, String author, String title, String price) {
		super();
		BookId = bookId;
		BookName = bookName;
		Author = author;
		this.title = title;
		Price = price;
	}

	public String getBookId() {
		return BookId;
	}

	public void setBookId(String bookId) {
		BookId = bookId;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "BookModel [BookId=" + BookId + ", BookName=" + BookName + ", Author=" + Author + ", title=" + title
				+ ", Price=" + Price + "]";
	}

}
