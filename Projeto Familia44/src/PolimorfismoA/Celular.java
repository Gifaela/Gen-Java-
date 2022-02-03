package PolimorfismoA;

	public class Celular extends Telefone {
	
		public Celular()
		{
			super("Telefone Celular");
			
		}
		@Override // � um metodo polimorfico
		public void toca(int codigoToque)
		{
			switch (codigoToque)
			{
			case 1: 
				System.out.println("\nTan�n�n�...Tan�n�n�");
				break;
			case 2: 
				System.out.println("\nPan�n�...Pan�n�");
				break;
				default:
					System.out.println("\nTin�n�...N�nini");
			}
		}
		@Override // � um metodo polimorfico
		public void disca(String numero)
		{
			System.out.println("\nO n�mero: "+numero+ " � um celular...");
		}
	}
