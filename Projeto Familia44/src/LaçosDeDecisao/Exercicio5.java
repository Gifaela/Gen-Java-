package La�osDeDecisao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op, gorgeta;
		double pagar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("C�d			->		Prato		->	  Valor");
		System.out.println("C�d:	1	->		Picanha		->  R$:25,00");
		System.out.println("C�d:	2	->		Lasanha		->  R$:20,00");
		System.out.println("C�d:	3	->		Strogonoff	-> 	R$:18,00");
		System.out.println("C�d:	4	->	 Bife Acebolado ->	R$:15,00");
		System.out.println("C�d:	5	->		P�o com ovo	->	R$:5,00");
		System.out.println("\nDigite a sua op��o: ");
		op = leia.nextInt();
		
		
		System.out.println("Voc� aceita parar 10% de gorgeta para o gar�om?");
		System.out.println("SIM --> 0 \nN�O --> 1");
		gorgeta = leia.nextInt();
				
		switch(op)
		{
		case 1:
			System.out.println("C�d:	1	->		Picanha		->  R$:25,00");
			pagar = 25;
			if(gorgeta==0) {
				pagar = pagar * 1.1;
			}System.out.println("Valor total a se pagar R$:"+pagar);
			break;
				
			
		
		case 2:
			System.out.println("C�d:	2	->		Lasanha		->  R$:20,00");
			pagar = 20;
			if(gorgeta==0) {
				pagar = pagar * 1.1;
			}System.out.println("Valor total a se pagar R$:"+pagar);
			break;

		case 3:
			System.out.println("C�d:	3	->		Strogonoff	-> 	R$:18,00");
			pagar = 18;
			if(gorgeta==0) {
				pagar = pagar * 1.1;
			}	System.out.println("Valor total a se pagar R$:"+pagar);
			break;
			
			
		case 4:
			System.out.println("C�d:	4	->	 Bife Acebolado ->	R$:15,00");
			pagar = 15;
			if(gorgeta==0) {
				pagar = pagar * 1.1;
			}System.out.println("Valor total a se pagar R$:"+pagar);
			break;
			
		case 5: 
			System.out.println("C�d:	5	->		P�o com ovo	->	R$:5,00");
			pagar = 5;
			if(gorgeta==0) {
				pagar = pagar * 1.1;
			}System.out.println("Valor total a se pagar R$:"+pagar);
			break;
			
		default:
			System.out.println("\nOp��o inv�lida!!!");
			break;

		}
	}
}