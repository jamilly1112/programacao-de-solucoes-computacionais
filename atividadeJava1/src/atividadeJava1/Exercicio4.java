package atividadeJava1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	double salario, result;
	
	System.out.println("salario =");
	salario = input.nextInt();
	
	result = (salario + salario / 4);
	System.out.println(result);
	
	}

}
