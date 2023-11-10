package atividades;

import java.util.Scanner;

public class exercicio_3 {
	
	public static void main(String[] args) {
		
		int idade,maior = 0,menor = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite uma idade");
		idade = input.nextInt();

		
		while(idade > 0) {
			
			if(idade < 21) {
				menor++;
			}
			if(idade > 50) {
				maior++;
			}
			
			System.out.println("Digite uma idade");
			idade = input.nextInt();

			
		}
		System.out.println("Total de pessoas menores de 21 anos: " + menor + "\nTotal de pessoas maiores de 50 anos: " + maior);
	}
}
