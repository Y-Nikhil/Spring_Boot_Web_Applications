package com.ashokit.entity;
 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="books")
public class Books {

	@Id
	private Integer books_id;
	
	
	private String books_name;
	
	
	private Double books_price;


	public Integer getBooks_id() {
		return books_id;
	}


	public void setBooks_id(Integer books_id) {
		this.books_id = books_id;
	}


	public String getBooks_name() {
		return books_name;
	}


	public void setBooks_name(String books_name) {
		this.books_name = books_name;
	}


	public Double getBooks_price() {
		return books_price;
	}


	public void setBooks_price(Double books_price) {
		this.books_price = books_price;
	}


	@Override
	public String toString() {
		return "Books [books_id=" + books_id + ", books_name=" + books_name + ", books_price=" + books_price + "]";
	}

	
	
	
}
