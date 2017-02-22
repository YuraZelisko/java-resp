package lesson01;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int balance = 1000;
		
		boolean work = true;
		
		while(true){

		System.out.println("enter 1 to chaeck balance");
		System.out.println("enter 2 for a credit");
		System.out.println("enter 3 for add into a balance");
		System.out.println("enter 4 for exit");
		
		String user = scanner.next();

		switch (user) {
		case "1": {
			System.out.println("your current balance = "+balance);
			break;
		}
		case "2": {
			System.out.println("how much money you want to get?");
			if(scanner.hasNextInt() == true){
				int credit = scanner.nextInt();
				if(credit > balance && credit >= 0){
					balance = balance - credit;
				}
			}else{
				System.out.println("wrong input");
			}
			break;
		}
		case "3": {
			 
			break;
		}case "4":{
//			work = false;
			System.exit(0);
			break;
		}
		default: {
			break;
		}
		}
		}

	}

}
