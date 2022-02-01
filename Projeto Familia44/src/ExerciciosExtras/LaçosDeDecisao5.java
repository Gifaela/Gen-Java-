/*A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de
ind�strias que s�o altamente poluentes do meio ambiente. O �ndice de polui��o aceit�vel
varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a
suspenderem suas atividades, se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o
intimadas a suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem ser
notificados a paralisarem suas atividades. Fa�a um sistema que leia o �ndice de polui��o
medido e emita a notifica��o adequada aos diferentes grupos de empresas.
*/
package ExerciciosExtras;

import java.util.Scanner;

public class La�osDeDecisao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double indP; //g1,g2,g3
	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o �ndice de polui��o? ");
		indP = leia.nextDouble();
		
		if (indP >= 0.05 && indP <= 0.25) {
			System.out.println("�ndide de polui��o aceitavel");
		}else if (indP > 0.25 && indP <= 0.3) {
			System.out.println("As ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades");
		}else if (indP > 0.3 && indP <= 0.4) {
			System.out.println("as industrias do 1� e 2� grupo s�o intimadas a suspenderem suas atividades");
		}else if (indP >= 0.5) {
			System.out.println("Todos os grupos devem ser notificados a paralisarem suas atividades");
		}
		

	}

}
