package Heran�aAula;

public class PessoaA {
	
	private String nome;
	private String endereco;
	private String cpf; //n�o pode ser int, pq ele � maior do que o int pode suportar.
	private int telefone; // int aguenta a quantidade 
	private int idade;
	
	public PessoaA(String nome, String endereco, String cpf, int telefone, int idade) {
		super(); // dindicar que os atributos s�o da minha super classe. Ele n�o � necess�rio.
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
	}

	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public int getTelefone() {
		return telefone;
	}



	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public void validarCpf() // valida��o por digitos
	{
		if (getCpf().length()!=11) //length conta quantos caracteres tem dentro do meu Cpf
		{
			System.out.println("\n Cpf Invalido!!--");
		}
		else {
			System.out.println("\nCpf V�lido!!--");
		}
	}
	

}
