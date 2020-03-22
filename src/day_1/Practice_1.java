package day_1;

import java.util.Scanner;

import day4_memo_operations_if.WarmUp3;

public class Practice_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name first: ");
		String name = scan.next().substring(0,5).replace("", "*");
		
		System.out.println(name);
		
	}

}
