package lesson01;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson_04 {

	public static void main(String[] args) {

		// Scanner scanner = null;
		//
		// scanner.nextLine();
		//
		// String s = null;
		// String s1 = "a";
		//
		// System.out.println(s == s1);
		// System.out.println(s.equals(s1));

		// Boolean b = null;
		//
		// Integer i = 1000;
		// Integer i1 = 1000;
		//
		// System.out.println(i == i1);
		// System.out.println(i.equals(i1));
		//
		//
		// int array [] = new int[10];
		//
		// array[3] = 100;
		//
		// int totalPriceAt_12_02_2017 = 1200;
		//
		// array[7] = totalPriceAt_12_02_2017;
		//
		// System.out.println(array[array.length - 1]);

		// for (int i = array.length - 1 ; i >= 0; i--) {
		// System.out.println(array[i]);
		// }

		// int [] mass = {12,5,3,75,6,437,5645};

		// for (int i = 0; i < mass.length; i++) {
		// for (int j = i + 1; j < mass.length; j++) {
		//
		// if(mass[i] < mass[j]){
		//
		// int number = mass[i];
		//
		// mass[i] = mass[j];
		//
		// mass[j] = number;
		//
		// }
		//
		// }
		// }

		// Arrays.sort(mass);
		//
		// for (int i = 0; i < mass.length; i++) {
		// System.out.println(mass[i]);
		// }

		int doubleArray[][] = new int[10][10];

		// doubleArray[2][6] = 100;

		// for (int i = 1; i < doubleArray.length; i++) {
		// for (int j = 1; j < doubleArray.length; j++) {
		//
		// doubleArray [i][j] = i * j;
		//
		// System.out.print(doubleArray [i][j]+"\t");
		//
		// }
		// System.out.println();
		// }

		String names[] = { "igor", "olga", "roma", "petro", "vika" };

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter some text");

		String inputName = scanner.next();// igor

		boolean existName = false;
		
		for (int i = 0; i < names.length; i++) {
				 
			if (inputName.equalsIgnoreCase(names[i])) {
				System.out.println("yes");
				existName = true;
			} 
		}
		
		if(existName == false){
			System.out.println("no");
		}
		
		int i = 1;
		i++;
		System.out.println(i);
		i = ++i;
		System.out.println(i);
		
		

	}

}
