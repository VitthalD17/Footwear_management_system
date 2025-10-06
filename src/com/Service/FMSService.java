package com.Service;

import com.core.FootWear;
import com.exception.FootwearException;

public interface FMSService {
String AddShoe(String name,String brand,int rating,double price,String shoe_type)throws FootwearException;
void display()throws FootwearException;
FootWear mostExpensive()throws FootwearException;
void sortbyId()throws FootwearException;
void sortbyName()throws FootwearException;
}
