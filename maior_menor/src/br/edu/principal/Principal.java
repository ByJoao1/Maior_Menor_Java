package br.edu.principal;

import java.util.Scanner;

public class Principal {
//Maior entre dois números
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.println("Digite o primeiro numero:");
		num1 = sc.nextInt();
		 
		System.out.println("Digite o segundo numero:");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
		System.out.println("O numero " + num1 + " É maior do que o " + num2 );
		}
		else if (num2 > num1) {
		System.out.println("O numero " + num2 + " É maior do que o " + num1);
		}
		else {
		System.out.println("Os numeros são iguais. ");
		}
	
	}
	

}