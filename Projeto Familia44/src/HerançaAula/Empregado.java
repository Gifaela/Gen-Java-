package Heran�aAula;

public class Empregado extends PessoaA{
	
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public Empregado(String nome,String endereco, String cpf,int telefone,int idade,
			int codigoSetor,float salarioBase,float imposto) 
	// mesmo com Heran�a n�o posso pegar o atrinuto, pois est� como pr
	{
	
		super(nome, endereco, cpf, telefone, idade);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	public void impostoInfo()
	{
		System.out.println("\nNome dos Empregados: "+getNome()+"\nCPF: "+getCpf()+
				"\nIdade: "+getIdade()+"\nTelefone: "+getTelefone()+"\nEndere�o: "+getEndereco()+
				"\nC�digo do setor: "+codigoSetor+"\nSal�rio base: "+salarioBase+
				"\nValor em porcentagem (sem o %) de imposto a ser retido");
	
	}
	public void calcularSalario()
	{
		double salarioTotal = salarioBase - (salarioBase * (imposto/100));
		System.out.println("\nO sal�rio total a ser recebido pelo empregado "+getNome()+" � igual a: "+salarioTotal);
	}

}
