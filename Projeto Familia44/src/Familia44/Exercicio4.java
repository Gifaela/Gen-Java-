/*Escreva  um sistema que leia tr�s n�meros inteiros e positivos 
 * (A, B, C) e calcule a seguinte express�o: 
 * D = (R+S)/2
 * R = (A+B)�
 * S = (B+C)�
 *  */
package Familia44;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		int A,B,C,D,R,S;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nEntre com o valor de A: ");
		A = leia.nextInt();
		System.out.print("\nEntre com o valor de B: ");
		B = leia.nextInt();
		System.out.print("\nEntre com o valor de C: ");
		C = leia.nextInt();
		
				 
		R = (int) Math.pow((A + B),2); //R = (A + B) * (A + B); //R = (A+B)�
		S = (int) Math.pow((B + C),2); //S = (B + C) * (B + C); //S = (B+C)�
		
		
		D = (R + S)/2;
		
		System.out.print("O valor do R �: "+R+"\nO valor do S �: "+S+"\nO valor do D �: "+D);
		
		leia.close();
		
	}

}
