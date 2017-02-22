package lesson01;

import java.util.Scanner;

public class ATM {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int balance = 1000;
		int pincode = 6024;
		boolean work = true;
		
		while (work == true){
		System.out.println("insert pincode");
		int pin = scanner.nextInt();
		
		 while(pincode != pin)
	        {
	            System.out.println("invalid pincode");
	            pin = scanner.nextInt();
	        }
		
		System.out.println("enter 1 for check balance");
		System.out.println("enter 2 for a credit");
		System.out.println("enter 3 to add into a balance");
		System.out.println("enter 4 fot exit");

		String choise = scanner.next();

		label:switch (choise) {
		case "1": {
			System.out.println("your current balance = "+balance);
			break;
		}
		case "2": {
			System.out.println("how much money you want to get?");
			
			if(scanner.hasNextInt()){
				int credit = scanner.nextInt();
				balance = balance - credit;
				if(balance > credit){
					System.out.println("Now your balance is "+balance);
				}else{System.out.println("You haven`t enough money");}
				
			}else{
				System.out.println("you can input only number");
			}

			break label;
			}
		
		case "3": {
			System.out.println("how much money you want add into a balance?");
			if(scanner.hasNextInt()){
				int deposit = scanner.nextInt();
				int y = balance + deposit;
				System.out.println("Now your balance is "+y);
			}else{
				System.out.println("you can input only number");
			}
			work = false;
			break label;
		}
		case "4":{
			System.out.println("press 1 for exit");
			int exit = 1;
			int realexit = scanner.nextInt();
			if (exit == realexit){
				System.out.println("exiting");
				break label;
			}else;
			
		}
		default: {
			 break;
		}
		}
		}
		scanner.close();
	}

}