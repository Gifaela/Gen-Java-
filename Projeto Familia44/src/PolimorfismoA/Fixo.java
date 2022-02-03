package PolimorfismoA;

public class Fixo extends Telefone {
	
	public Fixo()
	{
		super("Telefone Fixo");
		
	}
	@Override // � um metodo polimorfico
	public void toca(int numToques) //nome e tipo de parametro igual 
	{
		for(int i = 0; i < numToques; i++) 
		{
			System.out.println("\nOi...Oi..Oi...");
		}
	}
	@Override // � um metodo polimorfico
	public void disca (String numero)
	{
		System.out.println("\nDiscando: "+numero);
	}

}
