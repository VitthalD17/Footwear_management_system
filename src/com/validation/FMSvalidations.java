package com.validation;

import java.util.List;

import com.core.FootWear;
import com.core.Shoe_type;
import com.exception.FootwearException;

public class FMSvalidations {
public static FootWear validAllInputs(String name, String brand, 
		int rating, double price, String shoe_type,List<FootWear>list)throws FootwearException{
		valid_rating(rating);
		Shoe_type validtype=checktype(shoe_type);
		return new FootWear(name,brand,rating,price,shoe_type);
	
	
}
public static int valid_rating(int rating)throws FootwearException {
	FootWear foot=new FootWear(rating);
	if(foot.getRating()>=1 && foot.getRating()<=10) {
		return rating;
	}
	else 
		throw new FootwearException("The Rating is not betwwen 1-10");
	
}

public static Shoe_type checktype(String shoe_type)throws FootwearException {
	try {
	Shoe_type validtype= Shoe_type.valueOf(shoe_type.toUpperCase());
	
	
		return validtype;
	}catch(IllegalArgumentException e) {
		throw new FootwearException("Invalid Type!!!!");
	}
//	if(!validtype.equals(shoe_type)) {
//		throw new FootwearException("Invalid Type!!");
//	}
//	return validtype;
//		
	}
}

