/*Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio anterior e invoque
o m�todo que emite o som de cada um de forma polim�rfica, isto �, independente do tipo de animal.
*/
package PolimorfismoE;

	public abstract class ClasseAbs {
		
		private String especie; // declarando atributos
		
		public ClasseAbs(String especie) { //declarando metodo construtor
			this.especie=especie;
		}
		abstract public void som(double quantidade); //Abstract � uma clase abstrata // CONTRATO
		
		public String getEspecie() { // declarando Getter
			return especie;
		}
		
		public void setEspecie() { // declarando Setter
			this.especie = especie;
		}
		

	}
