/*	6-	Escrever um programa que receba v�rios n�meros inteiros no teclado.
 *  E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 
 *  0(zero).(DO...WHILE)
 * 
 */
	package La�oDeRepeti�ao;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		


	int num, totalNum=0, divisor=-1;
			//+=num      divisor ++
	Scanner leia = new Scanner (System.in);
	
	do {
		System.out.println("Informe um n�mero:");
		num = leia.nextInt();
		
		if(num % 3 == 0) {
			totalNum += num; // todalNum = todalNum + num
			divisor++; //divisor = divisor + 1
		}
			
	}
	
	while (num !=0);
	
	System.out.println("A m�dia dos multiplos de 3 � de: " + (totalNum/divisor));
	}
}

