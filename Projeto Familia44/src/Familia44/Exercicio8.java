/* O custo ao consumidor de um carro novo � a soma do custo de f�brica com a 
 * percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). 
 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
 * escrever um sistema que leia o custo de f�brica de um carro e escreva o custo 
 * ao consumidor. 
 */
package Familia44;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double custoF,custCarrN, custoImost, custoDist;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Entre com o valor do cusro de fabrica: ");
		custoF = leia.nextDouble();
		
		custoImost = (custoF/100)*45;
		custoDist = (custoF/100)*28;
		
		custoF = custoImost + custoF + custoDist;
		
		System.out.println("O valor do custo final �: "+custoF);
		
		
		
		
		
		

	}

}
