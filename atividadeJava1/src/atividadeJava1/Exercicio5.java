package atividadeJava1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double  diagmaior, diagmenor, area;
		
		System.out.println("diagonal maior e =");
		diagmaior = input.nextInt();
		
		System.out.println("diagonal menor e =");
		diagmenor =input.nextInt();
		
		area = (diagmaior * diagmenor) / 2;
		System.out.println("area e =" + area);

	}

}
