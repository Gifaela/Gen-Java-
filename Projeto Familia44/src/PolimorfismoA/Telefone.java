package PolimorfismoA;

	public abstract class Telefone { // classe abstrata // classe m�e -> super classe
		
		private String tipo;
		
		abstract public void disca(String numero);// m�todo abstrato
		abstract public void toca(int numToques);
		
		public Telefone (String tipo)
		{
			this.tipo = tipo;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		
	}
