package POO;

public class Automovel {
	
	//declara��o dos atributos da classe 
	//Parametro 
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;
	
	//criar o meu m�todo especial construtor
	//Atributo
	public Automovel (String nomeProprietario, String modelo, String placa,int ano )
	{
		this.nomeProprietario = nomeProprietario; //This � para identificar que � da class.
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		
		
	}
	public Automovel (String nomeProprietario, String placa)
	{
		this.nomeProprietario = nomeProprietario;
		this.placa = placa;
	}
	
	//Declara��o dos demais m�todos da classe
	
	public void imprirInfo()
	{
		System.out.println("\n " +nomeProprietario+" possui um "+modelo+ " com placa "+placa+" e ano "+ano);
	}
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	

}
 