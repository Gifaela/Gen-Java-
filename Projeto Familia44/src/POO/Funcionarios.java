package POO;

public class Funcionarios {
	
	private String nome;
	private String area; //area de atua��o
	private int tempoSer;
	private int idade;
	private double sal�rio;
	
	public Funcionarios(String nome, String area, int tempoSer, int idade, double sal�rio) {
		super();
		this.nome = nome;
		this.area = area;
		this.tempoSer = tempoSer;
		this.idade = idade;
		this.sal�rio = sal�rio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getTempoSer() {
		return tempoSer;
	}

	public void setTempoSer(int tempoSer) {
		this.tempoSer = tempoSer;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSal�rio() {
		return sal�rio;
	}

	public void setSal�rio(double sal�rio) {
		this.sal�rio = sal�rio;
	}
	
	
	
	

}
