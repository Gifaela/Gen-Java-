/*Jo�o, homem de bem, comprou um microcomputador para controlar o rendimento di�rio
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de S�o Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates) e
verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor
da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do
ZERO.
 * 
 */
package ExerciciosExtras;

import java.util.Scanner;

public class La�osDeDecisao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float P, E, M;  // renDi,maior50, multa, 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Entre com o peso do tomate: ");
		P = leia.nextFloat();
		
		if (P > 50){
			E = (P - 50);
			M = E * 4;
			System.out.print("Excesso de peso de: " +E+" \nValor da multa � de R$: "+M);
		}else if (P <= 50){
			E = 0;
			M = 0;
			System.out.println("Excesso de peso de: " +E+" \nValor da multa � de R$: "+M);
		}

			
			
		

	}

}
