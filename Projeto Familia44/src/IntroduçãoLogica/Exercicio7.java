package Introdu��oLogica;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a,b,c,d,e,f,x,y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Valor de A: ");
		a = leia.nextDouble();
		System.out.print("Valor de B: ");
		b = leia.nextDouble();
		System.out.print("Valor de C: ");
		c = leia.nextDouble();
		System.out.print("Valor de D: ");
		d = leia.nextDouble();
		System.out.print("Valor de E: ");
		e = leia.nextDouble();
		System.out.print("Valor de F: ");
		f = leia.nextDouble();
		
		
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.printf("O valor de X �: %.2f",x);
		System.out.printf("\nO valor de Y �: %.2f", y);
		
		leia.close();
		
		
		

	}

}
