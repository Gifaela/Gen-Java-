package PolimorfismoA;

	public class Publico extends Telefone{ //sub classe
		
		public Publico()
		{
			super("telefone p�blico");
			
		}
		@Override // � um metodo polimorfico
		public void toca(int numToques)
		{
			for(int i = 0; i < numToques; i++)
			{
				System.out.println("\nTrininim...Trininim");
			}
		}
		@Override // � um metodo polimorfico
		public void disca(String numero)
		{
			if(numero.charAt(0)=='9' || numero.charAt(0)=='8')  
				//charAt - busca um caracter dentro de uma string - nesse caso ele pega o primeiro n�mero (0) 
			{
				System.out.println("\nEste telefone n�o liga para celular...");
			}
			else
			{
				System.out.println("\nDiscand:  "+numero);
			}
		}
	
	}
