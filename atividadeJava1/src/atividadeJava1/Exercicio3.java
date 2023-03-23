package atividadeJava1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		double dolar, result;
		
		System.out.println("dollars em reais =");
		dolar = input.nextInt();
		
		result = (dolar * 5.24);
		System.out.println(result);
		

	}

}
