/*Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se este
n�mero � par ou �mpar, e se � positivo ou negativo.
*/
package ExerciciosExtras;

import java.util.Scanner;

public class La�osDeDecisao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero: ");
		num = leia.nextInt();
		
		if (num%2==0) {
		 System.out.println("O n�mero � Par");
		}else {
			System.out.println("O n�mero � Impar");
		}
	}

}
