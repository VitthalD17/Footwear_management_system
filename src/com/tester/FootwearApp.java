package com.tester;

import java.util.Scanner;

import com.Service.FMSService;
import com.Service.FMSServiceimpl;
import com.exception.FootwearException;

public class FootwearApp  {
public static void main(String[] args)throws FootwearException {
	try(Scanner sc=new Scanner(System.in)){
		FMSService service=new FMSServiceimpl();
		int choice;
		
		do {
			System.out.println("MENU:1.Add Product \n 2.Display \n 0.Exit");
			System.out.println("Enter the choice:");
			choice=sc.nextInt();
			
			try {
				switch(choice) {
				case 1:System.out.println("enter the details:name,brand "
						+ ",rating,price,shoetype(FORMAL, CASUAL, SPORTS)");
					service.AddShoe(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble(),sc.next());
					break;
					
				case 2:System.out.println("The Details of Product are:");
						service.display();
						break;
						
				case 3:System.out.println("The Most Expensive Shoe is:");
						System.out.println(service.mostExpensive());
						break;
						
				case 4:System.out.println("The Sorted list:");
					service.sortbyId();
					break;
				case 5:System.out.println("The Sorted list:");
					service.sortbyName();
				break;
				case 0:System.out.println("Thank You!!!");
				break;
				default:System.out.println("Invalid Choice!!!");
				break;
				}
			}catch(FootwearException f) {
				System.out.println(f.getMessage());
			}
		}while(choice!=0);
	}
}
}
