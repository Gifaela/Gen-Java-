package La�osDeDecisao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		double num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero: ");
		num = leia.nextDouble();
		
		if(num%2!=0)
		{
			System.out.println("O numero � Impar � potencia ao quadrado �" +Math.pow(num, 2));
			
		}
		else if (num%2==0)
		{
			System.out.println("O n�mero � Par e sua raiz � " +Math.sqrt(num));
			
		}
		
			
	
	}
}
