package lesson01;

import java.util.Scanner;

public class Zoo {

	public static void main(String[] args) {
		
		String [] animals = {"aligator", "monkey", "shark", "bear", "snake",
				null, null, null, null, null};
		Scanner scanner = new Scanner(System.in);
		boolean work = true;
		
		System.out.println("enter 1 for check animal");
		System.out.println("enter 2 for add animal");
		System.out.println("enter 3 for delete animal");
		System.out.println("enter 4 for show all animlas");
		
		String choise = scanner.next();
		int b = 0;
		int a = 0;

		while (work == true){
		
		switch (choise) {
		case "1":{
			for (int i = 0; i < animals.length;  i++) {

				if (animals[i] != null){
					
					System.out.println(animals[i]);
//				}else {
//					System.out.println(animals);
				}
			}
			break;
		}
		
		case "2":{
			System.out.println("which animal you want to add");
			for (int i = 0; i < animals.length;  i++) {
				String beast = scanner.nextLine();
			if(scanner.hasNext());
			else if (beast.equals(animals[i])){
				
		
				System.out.println("you have same animal");
				System.out.println("enter 4 for show all animlas");
			}
			else
			{
				beast = scanner.nextLine();
				animals [i] =  beast;
				animals[i].replaceFirst(null, beast);
				System.out.println("your animal add to cage");
			}
			}
		}break;
		
		case "3":{
			System.out.println("which animal you want delete");
			for (int i = 0; i < animals.length; i++) {
				String check = scanner.next();
				if (check.equals(animals[i])){
					animals[i].replaceFirst(null, check);
					System.out.println("your animal is deleted");
				}
				else{
					System.out.println("you haven`t animal like this");
				}
			}
		}
		case "4":{
			for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);

			}
		}
		default:
			break;
		}
		work = false;
		}
		scanner.close();
	}
	
}
