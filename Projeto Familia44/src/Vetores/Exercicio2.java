/*- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  ok
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados
*/
package Vetores;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		int[] numeros = new int[6];
		int somaP=0, contI=0;
		Scanner leia = new Scanner(System.in);
		
		//Bloco de leitura 
		for(int x=0;x<=5;x++) {
			System.out.println("Entre com um valo: ");
			numeros[x]=leia.nextInt();
			
		}
		//Bloco de exibi��o
		for(int y=0; y<6; y++) {
			
			if(numeros[y]%2==0) {
				System.out.println("Os n�meros pares s�o: "+numeros[y]);
				somaP = somaP + numeros[y];
			}
			else if (numeros[y]%2!=0) {
				System.out.println("Os n�meros impares s�o: "+numeros[y]);
				contI++;   //contI= contI + 1
			
			}
			
		}
		
		System.out.println("As soma dos numeros pares �: "+somaP);
		System.out.println("Quantidade de Impar �: "+ contI);
		
		
		
		
	}

}
