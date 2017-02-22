package lesson01;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class lesson03 {

	public static void main(String[] args) {

//		int array [] = new int [10];
//		array[3]= 100;
//		int totalPriseAt_12_02_2017 = 1200;
//		array [7]= totalPriseAt_12_02_2017;
//
//		
//		for (int i = array.length-1; i >= 0; i--) {
//			System.out.println(array[i]);
//		}
		// зробити сортування в обидві сторони
//		
//		int [] mass = {12,5,3,75,6,463,5641};
//		int doubleArray [][] = new int [10][10];
//		for (int i = 1; i < doubleArray.length; i++) {
//			for (int j = 1; j < doubleArray.length; j++) {
//				doubleArray[i][j] = i*j;
//				System.out.print(doubleArray[i][j]+"\t");
//			}
//			
//		}
//		
		String names [] = {"igor", "ola", "roma", "yura", "nazar"};
		Scanner sc = new Scanner(System.in);
		String inputName = sc.next();
		boolean existName = false;
		for (int i = 0; i < names.length; i++) {
//			
//			System.out.println(names[i]);
			if(inputName.equals(names[i])){
				System.out.println("yes");
				existName=true;
			}
			if (existName == false){
				System.out.println("no");
			}
				
			
				
			}
			
		}
		
	}
	


