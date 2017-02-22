package lesson01;

import java.util.Scanner;

public class ZooPark {

	public static void main(String[] args) {

		String[] animals = { "aligator", "monkey", "shark", "bear", "snake", null, null, null, null, null };
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter 1 for check animal");
		System.out.println("enter 2 for add animal");
		System.out.println("enter 3 for delete animal");
		System.out.println("enter 4 for show all animlas");

		String choise = scanner.next();

		switch (choise) {
		case "1": {
			for (int i = 1; i < animals.length; i++) {
				System.out.println(animals[i]);
			}

			break;
		}
		case "2": {

			break;
		}
		case "3": {

			break;
		}
		case "4": {

			break;
		}
		case "5": {

			break;
		}
		default:
			break;
		}

		if ("some".equals(animals[5])) {

		}
		// if(inputName.equals(names[i])){
		// System.out.println("yes");
		// existName=true;
		// }
		// if (existName == false){
		// System.out.println("no");
		// }

	}

}
