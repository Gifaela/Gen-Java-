/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o sal�rio e
 n�mero de filhos. A prefeitura deseja saber:   
a) m�dia do sal�rio da popula��o; 
b) m�dia do n�mero de filhos; 
c) maior sal�rio; 
d) percentual de pessoas com sal�rio at� R$100,00

*/

package ExerciciosExtras;

import java.util.Scanner;

public class La�osDeRepeti��o1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hab, numF;
		double sal, mediaS = 0, mediaF = 0, maiorS = 0, totalM100 = 0, percM100 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for (hab = 0; hab < 20; hab++) {
			System.out.println("Entre com S�lario: ");
			sal = leia.nextDouble();
			System.out.println("Entre com a quantidade de filhos: ");
			numF = leia.nextInt();
			
			mediaS = (sal + sal)/20;
			mediaF = (numF + numF)/20;
			
			if(maiorS < sal) {
				maiorS = sal;
			}
			
			if(sal > 100) {
				totalM100 = totalM100 + 1;
				percM100 = (totalM100*100)/20;
				
			}
			
			
			
		}
		System.out.println("M�dia de s�lario: "+mediaS);
		System.out.println("M�dia de filhos: "+mediaF);
		System.out.println("O maior sal�rio �: "+maiorS);
		System.out.println("Total de pessoas com s�lario maior que R$: 100 � de: "+totalM100);
		System.out.println("Porcwntage de pessoas com s�lario maior que R$: 100 � de: "+percM100);
		
		

	}

}
