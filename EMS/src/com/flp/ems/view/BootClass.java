package com.flp.ems.view;

import java.util.Scanner;

public class BootClass {
	private UserInteraction userinteraction;
	BootClass()
	{
		 userinteraction = new UserInteraction();
	}
	public void menuSelection() throws CloneNotSupportedException {
		Scanner sc = new Scanner(System.in);
		int i=1;
		while(i<10){
		int input = sc.nextInt();
		switch (input) {
		case 1:
			userinteraction.addEmployee();
			break;
		case 2:
			userinteraction.modifyEmployee();
			break;
		case 3:
			userinteraction.searchEmployee();
			break;
		case 4:
			userinteraction.removeEmplyee();
			break;
		case 5:
			userinteraction.showAllEmployee();
			break;
		default:
			System.out.println("Invalid Input");

		}
		i++;
		}
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Select Appropriate Choice");
		System.out.println("Press 1 to add a new employee");
		System.out.println("Press 2 to modify existing employee details");
		System.out.println("Press 3 to search existing employee");
		System.out.println("Press 4 to remove employee from system");
		System.out.println("Press 5 to get employee list");
		BootClass bootclass=new BootClass();
		bootclass.menuSelection();
	}

}
