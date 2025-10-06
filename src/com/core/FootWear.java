package com.core;

public class FootWear {
private int shoe_id;
private String name;
private String brand;
private int rating;
private double price;
private boolean availabinGallery;
private Shoe_type shoe_type;
private static int counter=2025000;


public FootWear() {}
public FootWear(String name,String brand,int rating,double price,String shoe_type) {
	this.shoe_id=++counter;
	this.name=name;
	this.brand=brand;
	this.rating=rating;
	this.price=price;
	this.shoe_type=Shoe_type.valueOf(shoe_type.toUpperCase());
	
}
public int getShoe_id() {
	return shoe_id;
}
public void setShoe_id(int shoe_id) {
	this.shoe_id = shoe_id;
}
public FootWear(int rating) {
	this.rating=rating;
}
public double getPrice() {
	return price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public void setPrice(double price) {
	this.price = price;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public String toString() {
	return "{Shoe_id"+shoe_id+",Name:"+name+",Brand:"+brand+",Rating:"+rating+",Price:"+price+",Shoe_Type:"+shoe_type+"}";
}



}
