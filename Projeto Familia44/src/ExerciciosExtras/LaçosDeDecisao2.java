/*Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de
horas trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00
por hora. Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o sal�rio total e o sal�rio
excedente.
*/
package ExerciciosExtras;

import java.util.Scanner;

public class La�osDeDecisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numH, sal, exc, salExc, salT;
		String cod;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Entre com nome do funcion�rio: ");	
		cod = leia.next();
		System.out.print("Entre com o n�mero de horas trabalhadas: ");
		numH = leia.nextInt();
		
		if (numH > 0 && numH <= 50 ) {
			exc = 0;
			sal = numH * 10;
			System.out.print("Seu sal�rio � de R$: "+sal);
		}else if (numH > 50) {
			exc = numH - 50;
			sal = 50*10;
			salExc = exc*20;
			salT = sal + salExc;
			System.out.print("Horas excedente � de "+exc);
			System.out.print("\nSal�rio � de R$:"+sal);
			System.out.print("\nSal�rio com excedente R$:"+salT);
			
		}else if (numH <= 0) {
			System.out.println("Voc� n�o trabalhou");
		}
		

	}

}
