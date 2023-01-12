package com.factory.design;

import java.util.Scanner;

public class BookingFactory {

	//Design a method which return Booking instance

	public static Booking getBookingDetails(String input) {
       
		if(input.equalsIgnoreCase("FirstTier")) {
    	  return new FirstTier();
      }
      else if(input.equalsIgnoreCase("SecondTier")) {
    	  return new SecondTier();
      }
      else if(input.equalsIgnoreCase("ThirdTier")) {
    	  return new ThirdTier();
      }
      throw new IllegalAccessError("Invalid Choice");
		
		
	}
	
	public static void main(String[] args) {
	try {
		System.out.println("Enter Tier type");
		Scanner scanner = new Scanner(System.in);
		String s= scanner.next();
		  Booking book = getBookingDetails(s);
		System.out.println(book.getAcClassTyes() );
	
	}catch(Exception e) {
		System.out.println(e);
	}
		}

}
