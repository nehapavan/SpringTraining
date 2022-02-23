package com.evoke.auditing.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OnlineBookStoreAppTable")
public class OnlineBookStoreApp extends AuditEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bookId")
	private int bookId;

	@Column(name = "bookName")
	private String bookName;

	@Column(name = "title")
	private String title;

	@Column(name = "author")
	private String author;

	@Column(name = "price")
	private double price;

	public OnlineBookStoreApp() {
		super();
	}

	public OnlineBookStoreApp(int bookId, String bookName, String title, String author, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "OnlineBookStore [bookId=" + bookId + ", bookName=" + bookName + ", title=" + title + ", author="
				+ author + ", price=" + price + "]";
	}
}
