package com.codegnan.controlstatements;
import java.util.*;
public class Wishesif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter city name:");
 String city=sc.nextLine();
 if(city.equalsIgnoreCase("hyderabad")) {
	 System.out.println("hello hyderabadi");
 }
 else {
	 if(city.equalsIgnoreCase("Karnataka")) {
		 System.out.println("hi ");
	 }
	 else {
		 if(city.equalsIgnoreCase("AndhraPradesh")) {
			 System.out.println("hi andhra");
		 }
		 else {
			 System.out.println("welcome");
		 }
	 }
 }
 sc.close();
	}

}
// to calculate monthly electricity bill
