/*Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o 
de uma atividade e o escreva em seguida. 
Encontre ap�s a maior pontua��o e a apresente. */

package ExerciciosExtras;

import java.util.Scanner;

public class Vetores1 {
	
	public static void main(String[] args) {
		
		float[] valor = new float [5];
		float maiorPont = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for (int c = 0; c < 5; c++) {
			System.out.println("Entre com um valor: ");
			valor[c]= leia.nextFloat();
			
			if(maiorPont < valor[c]) {
				maiorPont = valor[c];
			}
		}System.out.println("O valor da maior pontua��o � "+maiorPont);
		
		
		
	}

}
