package Exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1,n2,n3,media;
		int op;
		
		System.out.println("\nEntre com o dia do seu nascimento: ");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com o mês do seu nascimento em digitos: ");
		n2 = leia.nextFloat();
		System.out.println("\nEntre com o ano do seu nascimento com 4 digitos: ");
		n3 = leia.nextFloat();
		
		
		if(n3<=2005 )//&& significa o meu operador lógica E e o operador lógico ou representamos com ||  
		{
			System.out.println("\nApto a votar!!!");
		}
		else 
		{
			System.out.println("\nInapto a votar!!!");
		}
		
	}

}
