/*Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os n�meros
 de 1 at� ele. Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28*/
package ExerciciosExtras;

import java.util.Scanner;

public class La�osDeRepeti�ao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dig, soma = 0, cont = 0; //contador conta quantas vezes est� passando.
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero: ");
		dig = leia.nextInt();
		
		do
		{
			soma = soma + cont; 
			cont++; // Contar quantas vezes pessa no la�o e Amarzena no cont.
			
			
		}while(cont<=dig);
		
		System.out.println(soma);
		System.out.println(cont);

	}

}
