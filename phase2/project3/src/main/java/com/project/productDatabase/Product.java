package com.project.productDatabase;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "product")
public class Product {

	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int product_id;
	
	@Column(name = "product_name")
	String product_name;
	
	@Column(name = "quantity")
	int quantity;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Learner [product_id=" + product_id + ", productName=" + product_name + ", quantity=" + quantity
				+ "]";
	}

	public Product(String product_name, int quantity) {
	
		this.product_name = product_name;
		this.quantity = quantity;
	}
}
