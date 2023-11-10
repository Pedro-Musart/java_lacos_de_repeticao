package atividades;

import java.util.Scanner;

public class exercicio_5 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int n, soma = 0;
		
		System.out.println("Digite um número");
		n = input.nextInt();
		
		do {
			if(n > 0) {
				soma = soma + n;
			}
			System.out.println("Digite um número");
			n = input.nextInt();

		}
		while(n != 0);
		
		System.out.println("A soma dos números positivos é: " + soma);
	}
}
