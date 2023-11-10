package atividades;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		
		int n1, n2, i;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero do intervalo:");
		n1 = input.nextInt();
		System.out.println("Digite o segundo numero do intervalo:");
		n2 = input.nextInt();
	
		if (n1 < n2) {
			
			System.out.println("No intervalo entre " + n1 + " e " + n2 + ":");
			
			
			
			for(i = n1;i < n2; i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de " + "3 e 5");	
				}
				
			}

			
		} else {
			System.out.println("Intervalo inválido!");
		}
	}
}
