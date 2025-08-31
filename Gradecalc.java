package com.codegnan.controlstatements;
import java.util.*;
public class Gradecalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter marks");
int marks=s.nextInt();
if(marks>=90) {
	System.out.print("O");
}else {
	if(marks>=80) {
		System.out.print("A");
	}
	else {
		if(marks>=70) {
			System.out.print("B");
		}else
			if(marks>=60) {
				System.out.print("C");
			}
			else {
				if(marks>=50) {
					System.out.print("D");
				}
				else {
					if(marks>=35) {
						System.out.print("E");
					}
					else {
						System.out.println("F");
					}
				}
			}
	     }
       }
s.close();
	}

}
