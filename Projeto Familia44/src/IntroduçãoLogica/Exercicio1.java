/*1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos,
 *  meses e dias e mostre-a expressa apenas em dias. 
 */

package Introdu��oLogica;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		double anos, meses, dias, diasT;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Quantos anos voc� tem? ");
		anos = leia.nextFloat();
		System.out.print("Quantos meses voc� tem? ");
		meses = leia.nextFloat();
		System.out.print("Quantos dias voc� tem? ");
		dias = leia.nextFloat();
		
		anos = (anos*365);
		meses = (meses* 30);
		diasT = anos + meses + dias;
		
		System.out.printf("Voc� tem %.2f dias de vida",diasT);
		
		leia.close();
		
	}

}
