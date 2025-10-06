package com.Service;

import java.util.ArrayList;

import com.core.FootWear;
import com.exception.FootwearException;
import com.validation.FMSvalidations;

public class FMSServiceimpl implements FMSService{
ArrayList<FootWear>list=new ArrayList<>();
	@Override
	public String AddShoe(String name, String brand, int rating, double price, String shoe_type)
			throws FootwearException {
		//FootWear fw=new FootWear();
		FootWear fw=FMSvalidations.validAllInputs(name,brand,rating,price,shoe_type,list);
		list.add(fw);
		//after biryani
		System.out.println("The Order Accepted!!!");
		return null;
	}
	
	
	
	//After The Biryani
	@Override
	public void display() throws FootwearException {
		if(list.isEmpty()) {
			throw new FootwearException("No Entry is Present");
		}
		else {
			list.stream().forEach(f->System.out.println(f));
//			for(FootWear f:list) {
//				System.out.println(f);
//			}
		}
		
	}



	@Override
	public FootWear mostExpensive() throws FootwearException {
		if(list.isEmpty()) {
			throw new FootwearException("There is No Entry is Present");
		}
		
		
			FootWear expensive=list.get(0);
			for(FootWear f:list) {
				if(expensive.getPrice()<f.getPrice()) {
					expensive=f;
				}
			}
			return expensive;
		
		
	}



	@Override
	public void sortbyId() throws FootwearException {
		list.stream().sorted((b1,b2)->((Integer)b1.getShoe_id()).compareTo(b2.getShoe_id())).forEach(f->System.out.println(f));
		
		
	}



	@Override
	public void sortbyName() throws FootwearException {
		list.stream().sorted((b1,b2)->(b1.getName().compareTo(b2.getName()))).forEach(f->System.out.println(f));
		
	}

}
