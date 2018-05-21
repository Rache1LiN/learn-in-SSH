/**
 * 
 */
package edu.fjnu.domain;

/**
 * @author ASUS
 *
 */
public class Book {
	private String bookName;
	private String bookAuthor;
	private double price;

	public Book(){}
	public Book(String bookName,String bookAuthor,double price){
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.price=price;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
