/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. ok
A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize 
e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.*/
package ExerciciosExtras;

import java.util.Scanner;

public class Vetores2 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] valorD = new int [10];
		double total = 0, media = 0, maiorP = 0, cont = 0;
		
		for(int x = 0; x < 10; x++) {
			System.out.print("Entre com o valor do dado: ");
			valorD[x]=leia.nextInt();
			
			total = total + valorD[x];
			media = total/10;
			
			if (maiorP < valorD[x]) {
				maiorP = valorD[x];
				
				
				}
			if (maiorP == valorD[x]) {
				cont=cont+1;
			}
			
			
		}System.out.println("A m�dia �: "+media+"\nA maior pontua��o �:"+maiorP);
		System.out.println("\nQuantidade de vezer da maior pontua��o �: "+cont);
		
	}

}
