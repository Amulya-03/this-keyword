package com.constructor;

public class Product {
	int id;
	double price;
	public Product(int id,double price) {
		this.id=id;
		this.price=price;
	}
	public boolean isSame(Product p) {
		return this.id==p.id;
	}
	public void test() {
		System.out.println("Product Id:"+id+"\tPrice:"+price);
	}
	public static void main(String[] args) {
		Product product1=new Product(100, 40.5);
		Product product2=new Product(101, 35.5);
		System.out.println("product1 Details:");
		product1.test();
		System.out.println("product2 Details:");
		product2.test();
		if(product1.isSame(product2)) {
			System.out.println("both id's are same");
		} else {
			System.out.println("both id's are not same");
		}
	}
}

