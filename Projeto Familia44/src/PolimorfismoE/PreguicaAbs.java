package PolimorfismoE;

public class PreguicaAbs extends ClasseAbs {
	
	public PreguicaAbs() {
		
		super("Preguca"); //importando da classe abstrataespecie);
		// TODO Auto-generated constructor stub
	}
	
	@Override 
	public void som (double quantidade) { //m�todo abstratoda m�e abstrata
		quantidade = Math.random()*5.0;
		
		for (int i=0; i<quantidade; i++) {
			System.out.println("Aaahhhhhhhhhhhh");
		}
	}
}
