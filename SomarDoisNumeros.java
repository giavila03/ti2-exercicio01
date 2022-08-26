package exercicio01;

import java.util.*;

class SomarDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args){
		//Declaracao das variaveis
		int num1, num2, soma;
		
		//Ler primeira variavel
		System.out.println("Digite um numero");
		num1 = sc.nextInt();
		
		//Ler segunda variavel
		System.out.println("Digite outro numero");
		num2 = sc.nextInt();
		
		//Somar
		soma = num1 + num2;
		
		//Mostrar na tela
		System.out.println("Soma: " + soma);
	}

}
