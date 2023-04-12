package com.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pid;
	
	@NotBlank(message="Name is Mandatory")
	@Size(min=3, max=15, message="Name should have 3 to 15 characters")
	private String name;
	
	@NotNull(message="Price is Mandatory")
	@Positive(message="Price should be Positive")
	private Double price;
	
	@NotNull(message="Quantity is Mandatory")
	@Positive(message="Quantity should be Positive")
	private Integer quantity;
}
