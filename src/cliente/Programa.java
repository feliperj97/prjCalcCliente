package cliente;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		float n1, n2;
		int opcao = 5;
		Calculadora calc = new CalculadoraService().getCalculadoraPort();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("-Bem vindo a calculadora SOAP, escolha uma operação-");
		Scanner input1 = new Scanner(System.in);
	    System.out.println("Digite o primeiro número: ");
		n1 = input1.nextFloat();
		System.out.println("Digite o segundo número: ");
		n2 = input1.nextFloat();
	    System.out.println("1. Soma");  
	    System.out.println("2. Subtracao");  
	    System.out.println("3. Multiplicacao");  
	    System.out.println("4. Divisao");  
	    System.out.println("0. Sair");  
	    System.out.println("Operação: ");
	    opcao = input.nextInt();
	    
	    while(opcao != 0) {
			
			
			
			if(opcao == 1) {
				
				float resultado = calc.somar(n1, n2);
				System.out.println(resultado);
				break;
			}
			if(opcao == 2) {
				float resultado = calc.substrair(n1, n2);
				System.out.println(resultado);
				break;
			}
			if(opcao == 3) {
				float resultado = calc.multiplicar(n1, n2);
				System.out.println(resultado);
				break;
			}
			if(opcao == 4) {
				float resultado = calc.dividir(n1, n2);
				System.out.println(resultado);
				break;
			}
			
			
				
			
				
			
		}
	}
	
}
