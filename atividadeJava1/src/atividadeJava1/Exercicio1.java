package atividadeJava1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3, soma;
		
		System.out.println("num1");
		num1 = input.nextInt();
		
		System.out.println("num2");
		num2 = input.nextInt();
		
		System.out.println("num3");
		num3 = input.nextInt();
		
		soma = (num1 + num2 + num3) / 3;
		System.out.println(soma);
		
		
		

	}

}
