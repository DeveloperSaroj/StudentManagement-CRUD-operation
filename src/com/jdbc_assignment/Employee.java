package com.jdbc_assignment;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) 
	{ 
	do 
	  {
		System.out.println("********************************************************************************");
		System.out.println("*                    press 1 to create table                                   *");
		System.out.println("*______________________________________________________________________________*");
		System.out.println("*                    press 2 to Insert Data                                    *");
		System.out.println("*______________________________________________________________________________*");
		System.out.println("*                    press 3 to Update Table                                   *");
		System.out.println("*______________________________________________________________________________*");
		System.out.println("*                    press 4 to Delete Record                                  *");
		System.out.println("*______________________________________________________________________________*");
		System.out.println("*                    press 5 to Exit                                           *");
		System.out.println("********************************************************************************");
		Scanner sc= new Scanner(System.in);
		switch(sc.nextInt())
		{
		case 1: 
			System.out.println("Creating table...");
			JDBCpro.creating();
			break;
			
		case 2:
		   {
			System.out.println("please insert data accordingly");
			Scanner sc2=new Scanner(System.in);
			Scanner sc21=new Scanner(System.in);	
			System.out.println("Enter eno");
			int eno=sc2.nextInt();
			System.out.println("please enetr Ename");
			String ename=sc21.nextLine();
			System.out.println("Enter esalary");
			int esal=sc2.nextInt();		
			JDBCpro.inserting(eno, ename, esal);
			break;
	       }
	   case 3:
	       {
			System.out.println("please enter eno to update details");
			Scanner sc3=new Scanner(System.in);
			int eno=sc3.nextInt();
			Scanner sc31=new Scanner(System.in);
			System.out.println("please enter new name");
			String ename=sc31.nextLine();
			System.out.println("eneter new Saalry");
			int esal=sc3.nextInt();
			JDBCpro.updating(eno, ename, esal);		
			break;
		   }
	   case 4:
	      {
	       System.out.println("please engter eno to delete records");
	       Scanner sc4=new Scanner(System.in);
	       int eno=sc4.nextInt();
	       JDBCpro.deleting(eno);
	       break;
	      }
	    default :
	    	System.out.println("Thank you");
	    	System.out.println("Now we are redirecting to HOME page");
	    	System.out.println("----------------------------------------------");
	       break;
		}
	  }
	while(true);	 
	}
}


