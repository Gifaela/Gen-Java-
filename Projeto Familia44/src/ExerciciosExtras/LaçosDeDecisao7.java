/*Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos
(positivos maiores que zero). Em caso afirmativo, calcular a �rea do tri�ngulo.*/

package ExerciciosExtras;

import java.util.Scanner;

public class La�osDeDecisao7 {
	public static void main(String[] args) {
		
		float b,a,aT;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a base: ");
		b = leia.nextFloat();
		System.out.println("Entre com a altura: ");
		a = leia.nextFloat();
		
		if (b > 0 && a > 0) {
			aT = (b*a)/2;
			System.out.println("Valido! A �rea do tri�ngulo �: "+aT);
		}else {
			System.out.println("N�mero informado Invalido!");
		}
	}

}
