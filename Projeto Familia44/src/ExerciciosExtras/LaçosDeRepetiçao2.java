/*Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o  m�ltiplos de tr�s e que se 
encontram no conjunto dos n�meros de 1 at� 500.*/
package ExerciciosExtras;

public class La�osDeRepeti�ao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,somaI = 0;
		
		for (num = 1; num <= 500; num++) {
			if (num%3==0) { // Muliplo de 3
				somaI = somaI + num;
			}
		}System.out.println(somaI);

	}

}

