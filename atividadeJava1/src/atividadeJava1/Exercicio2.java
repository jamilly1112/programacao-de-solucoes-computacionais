package atividadeJava1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	int year1, year2, result;
	
	System.out.println("year1 =");
	year1 = input.nextInt();
	
	System.out.println("year2 =");
	year2 = input.nextInt();
	
	result = (year2 - year1);
	System.out.println(result);
	
	}

}
