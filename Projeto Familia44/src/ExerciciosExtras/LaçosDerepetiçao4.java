/*Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar ele por tr�s  (imprimindo o novo valor) 
 at� que ele seja maior do que 100. Ex.: se o usu�rio digita 5,  deveremos observar na tela a seguinte 
 sequ�ncia: 5 15 45 135.*/
package ExerciciosExtras;

import java.util.Scanner;

public class La�osDerepeti�ao4 {

	public static void main(String[] args) {
		
		double num = 0 ;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");	
		num = leia.nextDouble();
		while (num <= 100) {
			num = num *3;
			System.out.println(num);		
		}
		
	}
}
