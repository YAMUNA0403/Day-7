package com.codegnan.controlstatements;
import java.util.*;
public class IfElseexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
double accbalance=30000;
System.out.println("enter amount");
double withamt=sc.nextDouble();
if(withamt<=accbalance && withamt%100==0) {
	accbalance-=withamt;
	System.out.println(accbalance);
	
	}
else {
	System.out.println("insufficient funds");
}
sc.close();
}
}
//notes should be in the form of 100rs notes
