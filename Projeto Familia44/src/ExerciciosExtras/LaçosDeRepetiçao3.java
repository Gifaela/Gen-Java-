/*Elaborar um programa que efetue a leitura sucessiva de valores num�ricos ok
 e apresente no final o total do somat�rio, ok
 a m�dia e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usu�rio estiver 
 fornecendo valores positivos. Ou seja, o programa deve parar quando o usu�rio fornecer um valor negativo.*/
package ExerciciosExtras;

import java.util.Scanner;

public class La�osDeRepeti�ao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float valorN = 0, totalS = 0, cont = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while (valorN >= 0) {
			System.out.println("Entre com um valor num�rico: ");
			valorN = leia.nextFloat();
			if (valorN >= 0) {
				totalS = totalS + valorN;
				cont = cont+1;
			}		
			
		}
		System.out.println("O total da somat�ria � :"+totalS);
		System.out.println("A m�dia da soma dos valores �: "+(totalS/cont));
		System.out.println("O total de valor lido � de"+cont);

	}

}
